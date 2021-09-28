package com.techinfo.schoolmanagement.schservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.techinfo.schoolmanagement.schdao.StudentDao;
import com.techinfo.schoolmanagement.schentity.Student;

@SpringBootTest
public class StudentServiceTest {

	@Autowired
	private StudentService studentService;

	@MockBean
	private StudentDao studentDao;

	@BeforeEach
	void setUp() {

		Student student = new Student(1l, "Jack", "London", "M", "6th");
		Student student1 = new Student(2l, "John", "Chennai", "M", "7th");
		
		List<Student> studentList= new ArrayList<>();
		studentList.add(student);
		studentList.add(student1);
		
		Optional<Student> optStudent = Optional.of(student);
		
		Mockito.when(studentDao.findById(1l)).thenReturn(optStudent);

		Mockito.when(studentDao.findAll()).thenReturn(studentList);
	}

	@Test
	@DisplayName("Check Student by id working")
	//@Disabled
	public void getStudentByIdTest() {
		//StudentDto studentDto = new StudentDto("Vasan", "Chennai", "M", "7th");
		assertEquals("Srini", studentService.getStudentbyId(1).get().getName());
	}
	
	@Test
	public void getAllStudentsTest() {
		//StudentDto studentDto = new StudentDto("Vasan", "Chennai", "M", "7th");
		assertEquals(2, studentService.getAllStudents().size());
	}

}
