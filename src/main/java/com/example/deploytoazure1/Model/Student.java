package com.example.deploytoazure1.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private LocalDate born;
  private LocalTime bornTime;

  @Column(length = 100)
  private String name;

  public int getId(){
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBorn(LocalDate born) {
    this.born = born;
  }

  public void setBornTime(LocalTime bornTime) {
    this.bornTime = bornTime;
  }

  public String getName() {
    return name;
  }
}
