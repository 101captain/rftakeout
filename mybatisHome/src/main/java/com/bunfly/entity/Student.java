package com.bunfly.entity;

public class Student {

	//定义属性，和student表中的字段对应
	private int id;            //id===>sid
	private String name;    //name===>sname
	private int sex;
	private Classes classes;
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
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
	
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", classes=" + classes + "]";
	}
	
	
}
