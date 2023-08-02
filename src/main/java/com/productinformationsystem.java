package com;
public class productinformationsystem {
	productdb productdb;
	public productinformationsystem(productdb productdb)
	{
		this.productdb=productdb;
	}
	public product getproductinfo(int productid)
	{
		return productdb.getProduct(productid);
	}

}
