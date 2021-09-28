package com.techinfo.schoolmanagement.schentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long teacherId;
	private String name;
	private String grade;
	private String address;
	public long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Teacher(long teacherId, String name, String grade, String address) {
		this.teacherId = teacherId;
		this.name = name;
		this.grade = grade;
		this.address = address;
	}
	public Teacher()
	{
		
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", name=" + name + ", grade=" + grade + ", address=" + address
				+ "]";
	}
}
