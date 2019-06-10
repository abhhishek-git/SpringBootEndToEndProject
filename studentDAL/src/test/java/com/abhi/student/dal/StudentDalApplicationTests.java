package com.abhi.student.dal;

import java.util.Optional;

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
		student.setName("Abhi");
		student.setCourse("Java Web Services Crash Course");
		student.setFee(30d);
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentById() {
		Optional<Student> findById = (Optional<Student>) studentRepository.findById(2l);
		System.out.println(findById);
	}

}
