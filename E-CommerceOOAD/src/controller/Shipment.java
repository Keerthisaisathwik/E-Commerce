package controller;

import java.util.Date;

public class Shipment {

	private int shipmentNumber;
	private Date estimatedArrival;
	private LocalDateTime date;
	private Order orderDetails;
	private Order order;
	
	public Shipment(Order orderDetails) {
        	numberCounter += 1;
        	this.shipmentNumber = numberCounter;
        	this.date = LocalDateTime.now();
        	this.estimatedArrival = this.date.plusDays(3);
        	this.orderDetails = orderDetails;
        	orderDetails.setOrderStatus(OrderStatus.SHIPPED);
    	}

    	@Override
    	public String toString() {
        	return "Shipment{" +
                	"shipmentNumber=" + shipmentNumber +
                	", date=" + date +
                	", estimatedArrival=" + estimatedArrival +
                	", orderDetails=" + orderDetails +
                	'}';
    	}
}
