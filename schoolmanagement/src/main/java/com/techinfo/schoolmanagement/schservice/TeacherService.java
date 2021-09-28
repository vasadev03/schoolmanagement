package com.techinfo.schoolmanagement.schservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techinfo.schoolmanagement.schdao.TeacherDao;
import com.techinfo.schoolmanagement.schdto.TeacherDto;
import com.techinfo.schoolmanagement.schentity.Teacher;

@Service
public class TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	public boolean addTeacher(TeacherDto teacherDto) {
		Teacher teacher = new Teacher();
		teacher.setName(teacherDto.getName());
		teacher.setAddress(teacherDto.getAddress());
		teacher.setGrade(teacherDto.getGrade());
		teacherDao.save(teacher);
		return true;
	}

	public List<Teacher> getAllTeachers() {
		return teacherDao.findAll();
	}

	public Optional<Teacher> getTeacherbyId(long teacherId) {
		return teacherDao.findById(teacherId);
	}

	public boolean updateTeacherbyId(TeacherDto teacherDto, long teacherId) {
		Teacher teacher = teacherDao.findById(teacherId).get();
		System.out.println(teacher);
		teacher.setName(teacherDto.getName());
		teacher.setAddress(teacherDto.getAddress());
		teacher.setGrade(teacherDto.getGrade());
		teacherDao.save(teacher);
		return true;
	}

	public boolean deleteTeacherbyId(long teacherId) {
		teacherDao.deleteById(teacherId);
		return true;
	}
}
