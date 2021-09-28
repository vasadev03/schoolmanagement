package com.techinfo.schoolmanagement.schdao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techinfo.schoolmanagement.schentity.Student;

@Repository
public interface StudentDao  extends JpaRepository<Student, Long>{

}
 