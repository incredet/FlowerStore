package com.example.demo.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name="app-user")
@Setter
@Getter
public class AppUser {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;

    @Transient
    private int age;
    private LocalDate date;

    public int getAge() {
        return Period.between(date, LocalDate.now()).getYears();
    }
}
