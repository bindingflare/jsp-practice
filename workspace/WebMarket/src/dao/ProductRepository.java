package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();

	public ProductRepository() {
		Product phone;
		Product tablet;
		// TODO generate some products
	}
	
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
}
