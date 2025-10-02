package com.mx.chris.SpringHexagonal2.domain.repository;

import java.util.List;
import java.util.Optional;

import com.mx.chris.SpringHexagonal2.domain.entity.student.Student;

public interface StudentRepository {

    Student saveStudent(Student studentId);

    Optional<Student> findByid(Long id);

    List<Student> findByAll();

    void deleteByid(Long studentId);

}
