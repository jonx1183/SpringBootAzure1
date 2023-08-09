package com.example.deploytoazure1.Config;

import com.example.deploytoazure1.Model.Student;
import com.example.deploytoazure1.Repo.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class StartAndSave implements CommandLineRunner {

  StudentRepo studentRepo;

  public StartAndSave(StudentRepo studentRepo){
    this.studentRepo = studentRepo;
  }

  public void run(String... args)throws Exception{
    Student std1 = new Student();
    std1.setBorn(LocalDate.now());
    std1.setName("Annex");
    std1.setBornTime(LocalTime.now());
    studentRepo.save(std1);

    Student std2 = new Student();
    std2.setBorn(LocalDate.now().plusDays(1000));
    std2.setName("AViggo");
    studentRepo.save(std2);

  }
}
