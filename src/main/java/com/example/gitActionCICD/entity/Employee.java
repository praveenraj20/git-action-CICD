package com.example.gitActionCICD.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Employee {
    @Id
    private  int id;
    private String name;
    private String place;

}
