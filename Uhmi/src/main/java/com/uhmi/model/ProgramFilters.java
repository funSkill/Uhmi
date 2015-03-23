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
@Table(name = "program_filters")
public class ProgramFilters {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonView(View.Summary.class)
	private int id;
	
	@ManyToOne  
	@JoinColumn(name ="program_id")
	@JsonView(View.Summary.class)
	private Program program;
	
	@ManyToOne  
	@JoinColumn(name ="filter_id")
	@JsonView(View.Summary.class)
	private Filter filter;	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}	
	
	@Override
    public String toString() {
        return "ProgramFilter: [ id= " + id + ", program= " + program.getProgramName() + ", company= " + program.getCompany().getName() + ", filter= " + filter.getName() + " ]";
    }
}
