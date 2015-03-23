package com.uhmi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
import com.uhmi.jackson.View;

@Entity
@Table(name = "company")
public class Company {
	
	@Id
	@Column(name = "company_id")	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@JsonView(View.Summary.class)
	private int id;
	
	@Column(name = "name")
	@JsonView(View.Summary.class)
	private String name;
	
	@Column(name = "hotline")
	@JsonView(View.Summary.class)
	private String hotline;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHotline(String hotline) {
		this.hotline = hotline;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHotline() {
		return hotline;
	}
	
	@Override
    public String toString() {
       return "Company [ id= " + id + ", name= " + name + ", hotline= " + hotline + " ]";
    }
}
