package com.techinfo.schoolmanagement.schdto;

public class StudentDto {

	private long studentId;
	private String name;
	private String address;
	private String gender;
	private String grade;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public StudentDto(String name, String address, String gender, String grade) {
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.grade = grade;
	}
	public StudentDto()
	{
		
	}
	@Override
	public String toString() {
		return "StudentDto [studentId=" + studentId + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", grade=" + grade + "]";
	}
	
	
	
}
