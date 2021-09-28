package com.techinfo.schoolmanagement.schservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techinfo.schoolmanagement.schdao.StudentDao;
import com.techinfo.schoolmanagement.schdto.StudentDto;
import com.techinfo.schoolmanagement.schentity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public boolean addStudent(StudentDto studentDto) {
		Student student = new Student();
		student.setName(studentDto.getName());
		student.setGender(studentDto.getGender());
		student.setAddress(studentDto.getAddress());
		student.setGrade(studentDto.getGrade());
		studentDao.save(student);
		return true;
	}

	public List<Student> getAllStudents() {
		return studentDao.findAll();
	}

	public Optional<Student> getStudentbyId(long studentId) {
		return studentDao.findById(studentId);
	}

	public boolean updateStudentbyId(StudentDto studentDto, long studentId) {
		Student student = studentDao.findById(studentId).get();
		System.out.println(student);
		student.setName(studentDto.getName());
		student.setGender(studentDto.getGender());
		student.setAddress(studentDto.getAddress());
		student.setGrade(studentDto.getGrade());
		studentDao.save(student);
		return true;
	}

	public boolean deleteStudentbyId(long studentId) {
		studentDao.deleteById(studentId);
		return true;
	}
}
