/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO.entity;

/**
 *
 * @author shneha
 */
public class Student {
     private int id;
    private String student;
    private double classlevel;
    private String description;
    private String grade;
    private float fees;

    public Student(int id, String student, double classlevel, String description,String grade, float fees) {
        this.id = id;
        this.student = student;
        this.classlevel = classlevel;
        this.description = description;
        this.grade = grade;
        this.fees = fees;
    }

    public Student() {
        
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public double getClasslevel() {
        return classlevel;
    }

    public void setClasslevel(double classlevel) {
        this.classlevel = classlevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String isGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }

    
}
