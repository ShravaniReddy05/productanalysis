package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.product;
import com.productdb;
import com.productinformationsystem;

import static org.mockito.Mockito.*;
public class productinformationTest {

	@Test
	public void testGetproductinfo() {
		productdb productdb=mock(productdb.class);
		product obj=new product(1,"coffee",23);
		product obj1=new product(2,"espresso",100);
		when(productdb.getProduct(1)).thenReturn(obj);
		when(productdb.getProduct(2)).thenReturn(obj1);
		productinformationsystem prsystem=new productinformationsystem(productdb);
		product product=prsystem.getproductinfo(1);
		String productname=product.getProductname();
		float price=product.getPrice();
		assertEquals("coffee",productname);
		
	}

}
