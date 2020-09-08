package com.javatechie.crud.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private double price;
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}
	public Object getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setQuantity(Object quantity2) {
		// TODO Auto-generated method stub
		
	}
	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPrice(Object price2) {
		// TODO Auto-generated method stub
		
	}

}
