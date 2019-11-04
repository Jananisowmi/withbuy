package com.hcl.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PlacedOrder")
public class PlacedOrder {
	@Id
	@Column 
	private int orderId;
	@Column 
	private int quantity;
	@Column 
	private double price;
	@Column 
	private int brokerage;
	@Column 
	private double total_price;
	@Column 
	private int qtyOrdered;
	@Column 
	private int stockId;
	@Column 
	private int user_id;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBrokerage() {
		return brokerage;
	}
	public void setBrokerage(int brokerage) {
		this.brokerage = brokerage;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	@Override
	public String toString() {
		return "PlacedOrder [orderId=" + orderId + ", quantity=" + quantity + ", price=" + price + ", brokerage="
				+ brokerage + ", total_price=" + total_price + ", qtyOrdered=" + qtyOrdered + ", stockId=" + stockId
				+ ", user_id=" + user_id + "]";
	}

	
	
}


