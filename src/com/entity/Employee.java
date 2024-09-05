package com.entity;

public class Employee {
	private int emid;
	private String name;
	private int sal;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(int emid, String name, int sal, String dept) {
		super();
		this.emid = emid;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}

	public int getEmid() {
		return emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [emid=" + emid + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}


	
	}

	
	


