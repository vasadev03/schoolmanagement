package com.techinfo.schoolmanagement.schservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techinfo.schoolmanagement.schdao.SubjectDao;
import com.techinfo.schoolmanagement.schdto.SubjectDto;
import com.techinfo.schoolmanagement.schentity.Subject;

@Service
public class SubjectService {

	@Autowired
	private SubjectDao subjectDao;

	public boolean addSubject(SubjectDto subjectDto) {
		Subject subject = new Subject();
		subject.setName(subjectDto.getName());
		subject.setMaxMark(subjectDto.getMaxMark());
		subject.setGrade(subjectDto.getGrade());
		subjectDao.save(subject);
		return true;
	}

	public List<Subject> getAllSubjects() {
		return subjectDao.findAll();
	}

	public Optional<Subject> getSubjectbyId(long subjectId) {
		return subjectDao.findById(subjectId);
	}

	public boolean updateSubjectbyId(SubjectDto subjectDto, long subjectId) {
		Subject subject = subjectDao.findById(subjectId).get();
		System.out.println(subject);
		subject.setName(subjectDto.getName());
		subject.setMaxMark(subjectDto.getMaxMark());
		subject.setGrade(subjectDto.getGrade());
		subjectDao.save(subject);
		return true;
	}

	public boolean deleteSubjectbyId(long subjectId) {
		subjectDao.deleteById(subjectId);
		return true;
	}
}
