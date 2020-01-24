package com.exam.encapsulation;

public class Student {
private String Studentname;
private int Studentage;
private String Department;


public String getName(){
	return Studentname;
}
public void setName (String name){
	this.Studentname =name;
}
public int getAge(){
	return Studentage;
}
public void setAge (int age){
	this.Studentage = age;
}
public String getDepartment (){
	return Department;
}
public void setDepartment (String department){
	this.Department = department;
}
}
