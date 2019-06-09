package com.abhi.student.dal.repo;

import org.springframework.data.repository.CrudRepository;

import com.abhi.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
