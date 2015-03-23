package com.uhmi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
import com.uhmi.jackson.View;

@Entity
@Table(name = "filter_list")
public class FilterList {
	
	@Id
	@Column(name = "filter_list_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonView(View.Summary.class)
	private int id;
	
	@Column(name = "name")
	@JsonView(View.Summary.class)
	private String filterListName;
	
	@ManyToOne  
	@JoinColumn(name ="filter_1")
	@JsonView(View.Summary.class)
	private Filter filter1;
	
	@ManyToOne  
	@JoinColumn(name ="filter_2")
	@JsonView(View.Summary.class)
	private Filter filter2;

	@ManyToOne  
	@JoinColumn(name ="filter_3")
	@JsonView(View.Summary.class)
	private Filter filter3;
	
	@ManyToOne  
	@JoinColumn(name ="filter_4")
	@JsonView(View.Summary.class)
	private Filter filter4;
	
	@ManyToOne  
	@JoinColumn(name ="filter_5")
	@JsonView(View.Summary.class)
	private Filter filter5;
	
	@ManyToOne  
	@JoinColumn(name ="filter_6")
	@JsonView(View.Summary.class)
	private Filter filter6;
	
	@ManyToOne  
	@JoinColumn(name ="filter_7")
	@JsonView(View.Summary.class)
	private Filter filter7;
	
	@ManyToOne  
	@JoinColumn(name ="filter_8")
	@JsonView(View.Summary.class)
	private Filter filter8;
	
	@ManyToOne  
	@JoinColumn(name ="filter_9")
	@JsonView(View.Summary.class)
	private Filter filter9;
	
	@ManyToOne  
	@JoinColumn(name ="filter_10")
	@JsonView(View.Summary.class)
	private Filter filter10;
	
	@ManyToOne  
	@JoinColumn(name ="filter_11")
	@JsonView(View.Summary.class)
	private Filter filter11;
	
	@ManyToOne  
	@JoinColumn(name ="filter_12")
	@JsonView(View.Summary.class)
	private Filter filter12;
	
	@ManyToOne  
	@JoinColumn(name ="filter_13")
	@JsonView(View.Summary.class)
	private Filter filter13;
	
	@ManyToOne  
	@JoinColumn(name ="filter_14")
	@JsonView(View.Summary.class)
	private Filter filter14;
	
	@ManyToOne  
	@JoinColumn(name ="filter_15")
	@JsonView(View.Summary.class)
	private Filter filter15;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilterListName() {
		return filterListName;
	}

	public void setFilterListName(String filterListName) {
		this.filterListName = filterListName;
	}

	public Filter getFilter1() {
		return filter1;
	}

	public void setFilter1(Filter filter1) {
		this.filter1 = filter1;
	}

	public Filter getFilter2() {
		return filter2;
	}

	public void setFilter2(Filter filter2) {
		this.filter2 = filter2;
	}

	public Filter getFilter3() {
		return filter3;
	}

	public void setFilter3(Filter filter3) {
		this.filter3 = filter3;
	}

	public Filter getFilter4() {
		return filter4;
	}

	public void setFilter4(Filter filter4) {
		this.filter4 = filter4;
	}

	public Filter getFilter5() {
		return filter5;
	}

	public void setFilter5(Filter filter5) {
		this.filter5 = filter5;
	}

	public Filter getFilter6() {
		return filter6;
	}

	public void setFilter6(Filter filter6) {
		this.filter6 = filter6;
	}

	public Filter getFilter7() {
		return filter7;
	}

	public void setFilter7(Filter filter7) {
		this.filter7 = filter7;
	}

	public Filter getFilter8() {
		return filter8;
	}

	public void setFilter8(Filter filter8) {
		this.filter8 = filter8;
	}

	public Filter getFilter9() {
		return filter9;
	}

	public void setFilter9(Filter filter9) {
		this.filter9 = filter9;
	}

	public Filter getFilter10() {
		return filter10;
	}

	public void setFilter10(Filter filter10) {
		this.filter10 = filter10;
	}

	public Filter getFilter11() {
		return filter11;
	}

	public void setFilter11(Filter filter11) {
		this.filter11 = filter11;
	}

	public Filter getFilter12() {
		return filter12;
	}

	public void setFilter12(Filter filter12) {
		this.filter12 = filter12;
	}

	public Filter getFilter13() {
		return filter13;
	}

	public void setFilter13(Filter filter13) {
		this.filter13 = filter13;
	}

	public Filter getFilter14() {
		return filter14;
	}

	public void setFilter14(Filter filter14) {
		this.filter14 = filter14;
	}

	public Filter getFilter15() {
		return filter15;
	}

	public void setFilter15(Filter filter15) {
		this.filter15 = filter15;
	}
}
