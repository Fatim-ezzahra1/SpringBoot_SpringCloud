package org.fz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Company {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double price;
	
	
	public Company(Long id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
