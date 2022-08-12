package controller;

public class Item {

     private Product product;
     private double price;
     private int count;
	
     public Item(Product product, int count) {
        this.productId = product.getId();
        this.count = count;
        this.price = product.getPrice() * count;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productId=" + productId +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

    public void updateCount(int newCount){
        price = (price/count) * newCount;
        count = newCount;

    }
}
