package com.techinfo.schoolmanagement.schdao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techinfo.schoolmanagement.schentity.Teacher;

@Repository
public interface TeacherDao extends JpaRepository<Teacher, Long>{

}
