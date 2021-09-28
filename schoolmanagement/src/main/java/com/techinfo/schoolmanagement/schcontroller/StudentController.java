package com.techinfo.schoolmanagement.schcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techinfo.schoolmanagement.schdto.StudentDto;
import com.techinfo.schoolmanagement.schentity.Student;
import com.techinfo.schoolmanagement.schservice.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/addStudent")
	public String addStudent(@RequestBody StudentDto studentDto) {
		
			if (studentService.addStudent(studentDto))
				return "Student added successfully";
		

		return "Student is not added";
	}

	@GetMapping("/all")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{studentId}")
	public Optional<Student> getStudentbyId(@PathVariable("studentId") long studentId) {
		return studentService.getStudentbyId(studentId);
	}

	@PutMapping("/{studentId}")
	public String updateStudentbyId(@RequestBody StudentDto studentDto, @PathVariable("studentId") long studentId) {
		if (studentService.updateStudentbyId(studentDto, studentId))
			return "Student updated successfully";

		return "Student is not updated";

	}

	@DeleteMapping("/{studentId}")
	public String deleteStudentbyId(@PathVariable("studentId") long studentId) {
		if (studentService.deleteStudentbyId(studentId))
			return "Student deleted successfully";

		return "Student is not deleted";
	}

}
