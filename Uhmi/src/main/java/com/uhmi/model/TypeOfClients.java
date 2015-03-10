package com.uhmi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_of_clients")
public class TypeOfClients {
	
	@Id
	@Column(name = "type_of_clients_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
    public String toString() {
       return "TypeOfClients[ id= " + id + ", name= " + name + " ]";
    }
}
