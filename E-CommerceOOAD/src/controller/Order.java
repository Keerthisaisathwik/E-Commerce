package controller;

import java.util.ArrayList;
import java.util.Date;

public class Order {

	private int orderId;
	private Date orderDate;
	private double amount;
	
	private ArrayList<OrderLog> logs;
	private ArrayList<Item> items;
}
