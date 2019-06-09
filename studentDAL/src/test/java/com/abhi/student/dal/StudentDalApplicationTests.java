package com.abhi.student.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.abhi.student.dal.entities.Student;
import com.abhi.student.dal.repo.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("Java Web Services");
		student.setFee(30d);
		studentRepository.save(student);
	}

}
