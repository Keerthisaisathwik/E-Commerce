package controller;

import java.util.ArrayList;
import java.util.Date;

public class Order {

	private int orderId;
	private int orderNumber;
	private Date orderDate;
	private double amount;
	private String shippingAddress;
	
	private ArrayList<OrderLog> orderLogs;
	private ArrayList<Item> items;
	private  static int numberCounter =0;
	private OrderStatus orderStatus;
	
	
}
