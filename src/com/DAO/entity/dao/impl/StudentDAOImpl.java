/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO.entity.dao.impl;

import com.DAO.entity.Student;
import com.DAO.entity.dao.StudentDAO;

/**
 *
 * @author shneha
 */
public class StudentDAOImpl implements StudentDAO {

    private Student[] StudentList = new Student[10];
    private int counter = 0;

    @Override
    public boolean insert(Student s) {
        if (StudentList.length == counter) {
            return false;
        } else {
            StudentList[counter] = s;
        }
        counter++;
        return true;

    }

    @Override
    public boolean update(Student s) {
        if (StudentList.length == counter) {
            return false;
        } else {
            StudentList[counter] = s;
        }
        counter++;
        return true;

    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < StudentList.length; i++) {
            Student s = StudentList[i];
            if (s != null && s.getId() == id) {
                StudentList[i] = null;
                return true;
            }

        }
        return false;
    }

    @Override
    public Student getById(int id) {
        for (int i = 0; i < StudentList.length; i++) {
            Student s = StudentList[i];
            if (s != null && s.getId() == id) {
                StudentList[i] = null;
                return s;
            }

        }
        return null;

    }

    @Override
    public Student[] getAll() {

        return StudentList;
    }

}
