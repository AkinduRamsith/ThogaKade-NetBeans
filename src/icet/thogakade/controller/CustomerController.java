/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icet.thogakade.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import icet.thogakade.db.DBConnection;
import icet.thogakade.model.Customer;
import icet.thogakade.model.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */


public class CustomerController {
    public static int count=12;
    
    
    public static ArrayList<String> getAllCustomerId() throws ClassNotFoundException, SQLException{
        ResultSet rst=DBConnection.getInstance().getConnection().prepareStatement("Select id from Customer").executeQuery();
        ArrayList<String> idSet=new ArrayList<>();
        while(rst.next()){
            idSet.add(rst.getString(1));
        }
        return idSet;
    }

    public static boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String SQL = "Insert Into Customer Values(?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(SQL);
        pstm.setObject(1, customer.getId());
        pstm.setObject(2, customer.getName());
        pstm.setObject(3, customer.getAddress());
        pstm.setObject(4, customer.getSalary());
        return pstm.executeUpdate() > 0;
    }

    public static Customer searchCustomer(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From Customer where id='" + id + "' ";
        ResultSet rst = stm.executeQuery(SQL);
      //  return rst.next() ? new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"), rst.getDouble("salary")) : null;
        return rst.next() ? new Customer(id, rst.getString("name"), rst.getString("address"),rst.getDouble("salary")) : null;
    }

    public static boolean updateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String SQL = "Update Customer set name=?,address=?,salary=? where id=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(SQL);

        pstm.setObject(1, customer.getName());
        pstm.setObject(2, customer.getAddress());
        pstm.setObject(3, customer.getSalary());
        pstm.setObject(4, customer.getId());
        return pstm.executeUpdate() > 0;

    }

    public static boolean deleteCustomer(String search) throws ClassNotFoundException, SQLException {
        return DBConnection.getInstance().getConnection().createStatement().executeUpdate("Delete From Customer where id='" + search + "' OR name='" + search + "'") > 0;
    }

    public static ArrayList<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
        String SQL = "Select * From Customer";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Customer> customerList = new ArrayList<>();

        while (rst.next()) {
            Customer customer = new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"), rst.getDouble("salary"));
            customerList.add(customer);
        }
        return customerList;
    }

    public static String genarateId() {
        String genID = String.format("C%0d", count);
        count++;
        return genID;
    }

    public static void reduceCount() {
        count--;
    }
}
