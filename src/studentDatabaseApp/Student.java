package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private int tuitionBalance;
    private String studentID;
    private String courses;
    //these properties belong to all student objects, not the instantiation of each student.
    private static int tuition = 600;
    private static int id = 1000;


    //CONSTRUCTOR THAT PROMPTS TO ENTER NAME AND YEAR
    public Student (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the students first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter the students last name: ");
        this.lastName = scan.nextLine();
        System.out.println("1 - Never attended college and 1st year undergraduate/Freshman\n2 - Attended college before and 1st year undergraduate/Freshman\n3 - 2nd year undergraduate/sophomore\n4 - 3rd year undergraduate/junior\n5 - 4th year undergraduate/senior\nEnter students grade level");
        this.gradeLevel = scan.nextInt();

//        System.out.println(firstName + " " + lastName + " grade level: " + gradeLevel);

        setStudentID();
        System.out.println(firstName + " " + lastName + " grade level: " + gradeLevel + ", " + "Student Id: " + studentID);
    }

    //GENERATE AN ID
    private void setStudentID(){
        id++;
        //conversion happens here because of the empty string
        this.studentID = gradeLevel + "" + id;
    }

    //ENROLL IN COURSES

    //VIEW BALANCE

    //PAY TUITION

    //SHOW STATUS



}
