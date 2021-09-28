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

import com.techinfo.schoolmanagement.schdto.TeacherDto;
import com.techinfo.schoolmanagement.schentity.Teacher;
import com.techinfo.schoolmanagement.schservice.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	TeacherService teacherService;

	@PostMapping("/addTeacher")
	public String addTeacher(@RequestBody TeacherDto teacherDto) {
		if (teacherService.addTeacher(teacherDto))
			return "Teacher added successfully";

		return "Teacher is not added";
	}

	@GetMapping("/all")
	public List<Teacher> getAllTeachers() {
		return teacherService.getAllTeachers();
	}

	@GetMapping("/{teacherId}")
	public Optional<Teacher> getTeacherbyId(@PathVariable("teacherId") long teacherId) {
		return teacherService.getTeacherbyId(teacherId);
	}

	@PutMapping("/{teacherId}")
	public String updateTeacherbyId(@RequestBody TeacherDto teacherDto, @PathVariable("teacherId") long teacherId) {
		if (teacherService.updateTeacherbyId(teacherDto, teacherId))
			return "Teacher updated successfully";

		return "Teacher is not updated";

	}

	@DeleteMapping("/{teacherId}")
	public String deleteTeacherbyId(@PathVariable("teacherId") long teacherId) {
		if (teacherService.deleteTeacherbyId(teacherId))
			return "Teacher deleted successfully";

		return "Teacher is not deleted";
	}
}
