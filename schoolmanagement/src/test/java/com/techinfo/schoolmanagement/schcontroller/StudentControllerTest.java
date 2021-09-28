package com.techinfo.schoolmanagement.schcontroller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.techinfo.schoolmanagement.schdto.StudentDto;
import com.techinfo.schoolmanagement.schentity.Student;
import com.techinfo.schoolmanagement.schservice.StudentService;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	StudentService studentService;

	Student student;
	@BeforeEach
	void setUp() {
		 student = new Student(1l, "Jack", "London", "M", "6th");
	}

	@Test
	public void addStudentTest() throws Exception {
		StudentDto student = new StudentDto("Jack", "London", "M", "6th");
		Mockito.when(studentService.addStudent(student)).thenReturn(true);
		mockMvc.perform(MockMvcRequestBuilders.post("/student/addStudent").contentType(MediaType.APPLICATION_JSON)
				.content("{\r\n" + "	\"name\":\"jack\",\r\n" + "	\"address\":\"london\",\r\n"
						+ "	\"gender\":\"M\",\r\n" + "	\"grade\":\"6th\"\r\n" + "}"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void checkGetStudentByIdTest() throws Exception
	{
		
		Mockito.when(studentService.getStudentbyId(1l)).thenReturn(Optional.of(student));
		mockMvc.perform(MockMvcRequestBuilders.get("/student/1").contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(jsonPath("$.name").value(student.getName()));
	}

}
