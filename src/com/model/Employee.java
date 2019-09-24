package com.model;

public class Employee {
private Integer id;
private String name;
private Double sal;
private String dept;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
public String getDept() {
	return dept;
}
public Employee(Integer id, String name, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
}
public Employee(Integer id, String name, Double sal, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
	this.dept = dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name +  "]";
}

}
