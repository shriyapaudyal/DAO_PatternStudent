/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.DAO.entity.Student;
import com.DAO.entity.dao.StudentDAO;
import com.DAO.entity.dao.impl.StudentDAOImpl;
import java.util.Scanner;

/**
 *
 * @author shneha
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentDAO studentDAO =  new StudentDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add student:");
            System.out.println("2. Update student:");
            System.out.println("3.Delete student:");
            System.out.println("4.Get by id:");
            System.out.println("5.Dispaly All student:");
            System.out.println("6.Exit:");
            System.out.println("enter your choice[1-6]:");

            switch (input.nextInt()) {
                case 1: {
                    System.out.println("Add a student:");
                    Student s = new Student();
                    System.out.println("Enter ID:");
                    s.setId(input.nextInt());
                    System.out.println("Enter student Name:");
                    s.setStudent(input.next());
                    System.out.println("Enter Class:");
                    s.setClasslevel(input.nextDouble());
                    System.out.println("Enter Description:");
                    s.setDescription(input.next());
                    System.out.println("Enter grade:");
                    s.setGrade(input.next());
                    System.out.println("Enter fee:");
                    s.setFees(input.nextFloat());
                    if (studentDAO.insert(s)) {
                        System.out.println("Inserted Sucessfully");
                    } else {
                        System.out.println("Space Full");
                    }

                }

                break;
                case 2: {
                    Student[] students = studentDAO.getAll();

                    System.out.println("Enter ID to be updated:");
                    int a = input.nextInt();
                    for (int i = 0; i < students.length; i++) {
                        Student Student = students[i];

                        if (Student != null && Student.getId() == a) {

                            System.out.println("Add a student:");
                            Student s = new Student();
                            System.out.println("Enter ID:");
                            s.setId(input.nextInt());
                            System.out.println("Enter student Name:");
                            s.setStudent(input.next());
                            System.out.println("Enter Class:");
                            s.setClasslevel(input.nextDouble());
                            System.out.println("Enter Description:");
                            s.setDescription(input.next());
                            System.out.println("Enter grade:");
                            s.setGrade(input.next());
                            System.out.println("Enter fee:");
                            s.setFees(input.nextFloat());
                            if (studentDAO.update(s)) {
                                System.out.println("Inserted Sucessfully");
                            } else {
                                System.out.println("Space Full");
                            }

                        }

                    }
                    break;
                }
                case 3: {
                    Student[] students = studentDAO.getAll();

                    System.out.println("Enter ID to be deleted:");
                    int a = input.nextInt();
                    for (int i = 0; i < students.length; i++) {
                        Student Student = students[i];

                        if (Student != null && Student.getId() == a) {

                            studentDAO.delete(a);

                        }
                    }

                }
                break;
                case 4: {
                    Student[] students = studentDAO.getAll();

                    System.out.println("Display by id:");
                    System.out.println("Enter ID:");
                    int a = input.nextInt();
                    for (int i = 0; i < students.length; i++) {
                        Student Student = students[i];

                        if (Student != null && Student.getId() == a) {

                            System.out.println("ID:" + Student.getId());
                            System.out.println("Course Name:" + Student.getStudent());
                            System.out.println("class:" + Student.getClasslevel());
                            System.out.println("Description:" + Student.getDescription());
                            System.out.println("grade:" + Student.isGrade());
                            System.out.println("fee:" + Student.getFees());

                        }
                    }
                    break;
                }
                case 5: {

                    Student[] students = studentDAO.getAll();


                    for (int i = 0; i < students.length; i++) {
                         Student Student = students[i];

                        if (Student != null ) {
                            System.out.println("ID:" + Student.getId());
                            System.out.println("Course Name:" + Student.getStudent());
                            System.out.println("class:" + Student.getClasslevel());
                            System.out.println("Description:" + Student.getDescription());
                            System.out.println("grade:" + Student.isGrade());
                            System.out.println("fee:" + Student.getFees());

                        }

                    }

                    break;
                }

                case 6: {
                    System.out.println("Do You Really Want To Exit[y/n]:");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.exit(0);
                    }

                    break;

                }
            }
        }
    }
}
