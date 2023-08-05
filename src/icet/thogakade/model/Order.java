/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icet.thogakade.model;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Order {
    private String orderId;
    private String customerId;
    private String date;
    private ArrayList<OrderDetail>orderDetailList;

    public Order(String orderId, String custId, String date, ArrayList<OrderDetail> orderDetailList) {
        this.orderId = orderId;
        this.customerId = custId;
        this.date = date;
        this.orderDetailList = orderDetailList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustId() {
        return customerId;
    }

    public void setCustId(String custId) {
        this.customerId = custId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(ArrayList<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
    
    
}
