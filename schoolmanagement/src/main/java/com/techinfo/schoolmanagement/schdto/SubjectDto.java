package com.techinfo.schoolmanagement.schdto;

public class SubjectDto {

	private long subjectId;
	private String name;
	private int maxMark;
	private String grade;
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxMark() {
		return maxMark;
	}
	public void setMaxMark(int maxMark) {
		this.maxMark = maxMark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public SubjectDto(long subjectId, String name, int maxMark, String grade) {
		this.subjectId = subjectId;
		this.name = name;
		this.maxMark = maxMark;
		this.grade = grade;
	}
	public SubjectDto()
	{
		
	}
	@Override
	public String toString() {
		return "SubjectDto [subjectId=" + subjectId + ", name=" + name + ", maxMark=" + maxMark + ", grade=" + grade
				+ "]";
	}
	
	
}
