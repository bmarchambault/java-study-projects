package Udemy_course_projects.bankAcctApp.studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        //ask how many new students to add
//        student1.enroll();
//        student1.viewTuitionBalance();
//        student1.payTuition();
//        System.out.println(student1.showInfo());

//to prevent creating student objects one by one:

// ask how many new students to add
        System.out.println("Enter the number of students you'd  like to enroll");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        //create an array of students
        Student[] students = new Student[numOfStudents];
    //loop through the array of student objects and assign the properties to each
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].viewTuitionBalance();
            students[n].payTuition();

        }
        //loop through the student object and display each ones information.
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].showInfo());
        }
    }
}
