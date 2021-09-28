package com.techinfo.schoolmanagement.schdto;

public class TeacherDto {

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
	public TeacherDto(long teacherId, String name, String grade, String address) {
		this.teacherId = teacherId;
		this.name = name;
		this.grade = grade;
		this.address = address;
	}
	public TeacherDto()
	{
		
	}
	@Override
	public String toString() {
		return "TeacherDto [teacherId=" + teacherId + ", name=" + name + ", grade=" + grade + ", address=" + address
				+ "]";
	}
	
	

}
