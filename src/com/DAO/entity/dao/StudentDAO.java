/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO.entity.dao;

import com.DAO.entity.Student;

/**
 *
 * @author shneha
 */
public interface StudentDAO {
    boolean insert(Student s);
     boolean update(Student s);
     boolean delete(int id);
   Student getById(int id);
 Student[] getAll();
    
}
