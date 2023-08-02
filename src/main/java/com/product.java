package com;

/**
 * Hello world!
 *
 */
public class product 
{
	private int productid;
	private String productname;
	private float price;
	public product()
	{
		super();
	}
	public product(int productid, String productname, float price)
	{
		super();
		this.productid=productid;
		this.productname=productname;
		this.price=price;
	}
    public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "product[productid:"+productid+"productname :"+productname+"price :"+price+"]";
	}
}
