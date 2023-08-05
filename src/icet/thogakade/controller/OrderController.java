/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icet.thogakade.controller;

import icet.thogakade.db.DBConnection;
import icet.thogakade.model.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class OrderController {
    
    public static String getLastOrderId() throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select id From Orders Order By id DESC Limit 1");
        return rst.next() ? rst.getString("id") : null;
    }
    
    public static boolean placeOrder(Order order) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        try{
        connection.setAutoCommit(false);
        PreparedStatement pstm = connection.prepareStatement("Insert into Orders values(?,?,?)");
        pstm.setObject(1, order.getOrderId());
        pstm.setObject(2, order.getDate());
        pstm.setObject(3, order.getCustId());
        boolean orderIsAdded=pstm.executeUpdate() >0;
        if(orderIsAdded){
            boolean orderDetailAdded=OrderDetailController.addOrderdetail(order.getOrderDetailList());
            if(orderDetailAdded){
                boolean itemIsupdated=ItemController.updateStock(order.getOrderDetailList());
                if(itemIsupdated){
                    connection.commit();
                    return true;
                }
            }
        }
        connection.rollback();
        return false;
        }finally{
            connection.setAutoCommit(true);
        }
    }
}
