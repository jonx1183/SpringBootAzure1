package com.example.deploytoazure1;

import com.example.deploytoazure1.Model.Student;
import com.example.deploytoazure1.Repo.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class  DeployToAzure1ApplicationTests {

  @Autowired
  StudentRepo studentRepo;


  @Test
  void contextLoads() {
  }

  @Test
  void testStudent(){
    Student std1 = new Student();
    std1.setBorn(LocalDate.now());
    std1.setName("Annex");
    studentRepo.save(std1);

    Student std2 = new Student();
    std2.setBorn(LocalDate.now());
    std2.setName("AViggo");
    studentRepo.save(std2);

    List<Student> lst = studentRepo.findAll();
    assertEquals(2, lst.size());

    studentRepo.delete(std1);
    lst = studentRepo.findAll();
  }

}
