/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icet.thogakade.controller;

import icet.thogakade.db.DBConnection;
import icet.thogakade.model.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class OrderDetailController {
    public static boolean addOrderdetail(ArrayList<OrderDetail> orderDetailList) throws ClassNotFoundException, SQLException{
        for(OrderDetail orderDetail : orderDetailList){
            boolean isAdded=addOrderdetail(orderDetail);
            if(!isAdded){
                return false ;
            }
        }
        return true;
    }
    public static boolean addOrderdetail(OrderDetail orderDetail) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("Insert into OrderDetail values(?,?,?,?)");
        pstm.setObject(1, orderDetail.getOrderId());
        pstm.setObject(2, orderDetail.getItemCode());
        pstm.setObject(3, orderDetail.getQty());
        pstm.setObject(4, orderDetail.getUnitPrice());
        return pstm.executeUpdate() >0 ;
    }
}
