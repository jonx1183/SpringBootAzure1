package com.example.deploytoazure1.Repo;

import com.example.deploytoazure1.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Integer> {

  Optional<Student> findByName(String name);
}
