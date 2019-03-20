package com.lovo.spring.bean;
/**
 * 学生实体
 * @author Administrator
 * @version 1.0
 *
 */
public class StudentEntity {
   
	private String stuName; //名字
	private int age;//年龄
	
	private TeacherEntity t;
	
	
	
	public TeacherEntity getT() {
		return t;
	}
	public void setT(TeacherEntity t) {
		this.t = t;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
