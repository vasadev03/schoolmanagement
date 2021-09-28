package com.techinfo.schoolmanagement.schentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "sub_id")
	private long subjectId;
	@Column(name = "sub_name", nullable = false)
	private String name;
	@Column(name = "	")
	private int maxMark;
	@Column(name = "sub_grade")
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

	public Subject(long subjectId, String name, int maxMark, String grade) {
		this.subjectId = subjectId;
		this.name = name;
		this.maxMark = maxMark;
		this.grade = grade;
	}

	public Subject() {

	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", name=" + name + ", maxMark=" + maxMark + ", grade=" + grade + "]";
	}

}
