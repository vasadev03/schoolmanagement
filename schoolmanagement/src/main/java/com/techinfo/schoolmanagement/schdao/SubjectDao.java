package com.techinfo.schoolmanagement.schdao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techinfo.schoolmanagement.schentity.Subject;

@Repository
public interface SubjectDao extends JpaRepository<Subject, Long>{

}
