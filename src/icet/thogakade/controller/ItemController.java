/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icet.thogakade.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import icet.thogakade.db.DBConnection;
import icet.thogakade.model.Item;
import icet.thogakade.model.OrderDetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class ItemController {
    public static int count=22;

    public static ArrayList<String> getAllItemCode() throws ClassNotFoundException, SQLException{
        ResultSet rst=DBConnection.getInstance().getConnection().prepareStatement("Select code From Item").executeQuery();
        ArrayList<String> codeSet=new ArrayList<>();
        while(rst.next()){
            codeSet.add(rst.getString(1));
        }
        return codeSet;
    }
    public static boolean updateStock(ArrayList<OrderDetail> orderDetailList) throws ClassNotFoundException, SQLException{
        for(OrderDetail orderDetail : orderDetailList){
            if(!updateStock(orderDetail)){
                return false;
            }
        }
        return true;
    }
    public static boolean updateStock(OrderDetail orderDetail) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("Update Item set qtyOnHand=qtyOnHand-? where code=?");
        pstm.setObject(1, orderDetail.getQty());
        pstm.setObject(2, orderDetail.getItemCode());
        return pstm.executeUpdate() > 0;
    }
    
    public static boolean addItem(Item item) throws SQLException, ClassNotFoundException {
        String SQL = "Insert Into item Values(?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(SQL);
        pstm.setObject(1, item.getCode());
        pstm.setObject(2, item.getDescription());
        pstm.setObject(3, item.getUnitPrice());
        pstm.setObject(4, item.getQtyOnHand());
        return pstm.executeUpdate() > 0;
    }

    public static Item searchItem(String search) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From Item where code='" + search + "' OR description='" + search + "'";
        ResultSet rst = stm.executeQuery(SQL);
        return rst.next() ? new Item(rst.getString("code"), rst.getString("description"), rst.getDouble("unitPrice"), rst.getInt("qtyOnHand")) : null;

    }

    public static boolean updateItem(Item item) throws SQLException, ClassNotFoundException {
        String SQL = "Update Item set description=?,unitPrice=?,qtyOnHand=? where code=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(SQL);

        pstm.setObject(1, item.getDescription());
        pstm.setObject(2, item.getUnitPrice());
        pstm.setObject(3, item.getQtyOnHand());
        pstm.setObject(4, item.getCode());
        return pstm.executeUpdate() > 0;

    }

    public static boolean deleteItem(String search) throws ClassNotFoundException, SQLException {
        return DBConnection.getInstance().getConnection().createStatement().executeUpdate("Delete From Item where code='" + search + "' OR description='" + search + "'") > 0;
    }

    public static ArrayList<Item> getAllItems() throws ClassNotFoundException, SQLException {
        String SQL = "Select * From Item";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Item> itemList = new ArrayList<>();

        while (rst.next()) {
            Item item = new Item(rst.getString("code"), rst.getString("description"), rst.getDouble("unitPrice"), rst.getInt("qtyOnHand"));
            itemList.add(item);
        }
        return itemList;
    }

    public static String genarateId() {
        String genID = String.format("P%0d", count);
        count++;
        return genID;
    }

    public static void reduceCount() {
        count--;
    }
}
