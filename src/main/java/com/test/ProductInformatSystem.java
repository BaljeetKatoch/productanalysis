package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import Product.product.Product;
import Product.product.ProductDB;
import Product.product.ProductInformationSystem;

import static org.mockito.Mockito.*;
public class ProductInformatSystem {

	@Test
	public void testGetProductInfo() {
		ProductDB productDB=mock(ProductDB.class);
		Product obj= new Product(1,"Coffee",23);
		Product obj1= new Product(2,"Espresso",100);
		when(productDB.getProduct(1)).thenReturn(obj);
		when(productDB.getProduct(2)).thenReturn(obj1);
		
		ProductInformationSystem prSystem=new ProductInformationSystem(productDB);
		
		Product product=prSystem.getProductInfo(2);
		String productName= product.getProductName();
		float price=product.getPrice();
		assertEquals("Espresso",productName);
	}

}
