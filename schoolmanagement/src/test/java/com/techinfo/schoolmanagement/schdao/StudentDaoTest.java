package com.techinfo.schoolmanagement.schdao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.techinfo.schoolmanagement.schentity.Student;

@DataJpaTest
public class StudentDaoTest {

	@Autowired
	StudentDao studentDao;

	@Autowired
	TestEntityManager testEntityManager;

	@BeforeEach
	void setup() {
		Student student = new Student(1l, "Jack", "London", "M", "6th");
		testEntityManager.persist(student);
	}

	@Test
	public void checkFindByIdIsWorkingOrNot() {
		Student stu = studentDao.findById(1l).get();
		assertEquals("Jack", stu.getName());
	}
}
