package com.in.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private Integer marks;
		
	public Student() {
		super();
	 	
	}

	public Student(Integer id, String firstName, String lastName, Integer marks) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
	}

	public Integer getSid() {
		return id;
	}

	public void setSid(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

}
