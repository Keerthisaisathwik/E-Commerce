package controller;

import java.util.ArrayList;

public interface Searchable {

	public ArrayList<Product> searchCategory(String categoryName);
	public ArrayList<Product> searchProduct(String productName);
}
