/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sanketkesarkar
 */
public class Order {
    
    ArrayList<OrderItem>OrderItemList;

    public Order() {
        this.OrderItemList= new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return OrderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> OrderItemList) {
        this.OrderItemList = OrderItemList;
    }

    public void addNewOrderItem(Product product,double price,int quantity){
        OrderItem orderItem= new OrderItem(product,price,quantity);
        OrderItemList.add(orderItem);
        
    }
    public void deleteItem(OrderItem item){
        this.OrderItemList.remove(item);
        
    }
    public OrderItem findProduct(Product product){
        for(OrderItem oi:this.getOrderItemList()){
            if(oi.getProduct().equals(product)){
                return oi;
            }
        }
        return null;
    }
    
    
}
