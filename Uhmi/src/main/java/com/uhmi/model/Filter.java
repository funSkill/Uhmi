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
@Table(name = "filter")
public class Filter {
	
	@Id
	@Column(name = "filter_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonView(View.Summary.class)
	private int id;
	
	@Column(name = "name")
	@JsonView(View.Summary.class)
	private String name;
	
	@Column(name = "value")
	@JsonView(View.Summary.class)
	private String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
    public String toString() {
       return "Company[ id= " + id + ", name= " + name + ", value= " + value + " ]";
    }
}
