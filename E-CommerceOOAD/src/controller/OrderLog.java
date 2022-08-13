package controller;

import java.util.Date;

public class OrderLog {

	private Date creationTimeStamp;
	private OrderStatus status;
	public OrderLog(Date creationTimestamp, OrderStatus status) {
        	this.creationTimestamp = creationTimestamp;
        	this.status = status;
    	}
}
