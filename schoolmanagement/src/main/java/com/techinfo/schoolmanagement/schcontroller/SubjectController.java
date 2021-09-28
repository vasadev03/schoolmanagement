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

import com.techinfo.schoolmanagement.schdto.SubjectDto;
import com.techinfo.schoolmanagement.schentity.Subject;
import com.techinfo.schoolmanagement.schservice.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	SubjectService subjectService;

	@PostMapping("/addSubject")
	public String addSubject(@RequestBody SubjectDto subjectDto) {
		if (subjectService.addSubject(subjectDto))
			return "Subject added successfully";

		return "Subject is not added";
	}

	@GetMapping("/all")
	public List<Subject> getAllSubjects() {
		return subjectService.getAllSubjects();
	}

	@GetMapping("/{subjectId}")
	public Optional<Subject> getSubjectbyId(@PathVariable("subjectId") long subjectId) {
		return subjectService.getSubjectbyId(subjectId);
	}

	@PutMapping("/{subjectId}")
	public String updateSubjectbyId(@RequestBody SubjectDto subjectDto, @PathVariable("subjectId") long subjectId) {
		if (subjectService.updateSubjectbyId(subjectDto, subjectId))
			return "Subject updated successfully";

		return "Subject is not updated";

	}

	@DeleteMapping("/{subjectId}")
	public String deleteSubjectbyId(@PathVariable("subjectId") long subjectId) {
		if (subjectService.deleteSubjectbyId(subjectId))
			return "Subject deleted successfully";

		return "Subject is not deleted";
	}

}
