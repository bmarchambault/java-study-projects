package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private int tuitionBalance = 0;
    private String studentID;
    private String courses;
    //these properties belong to all student objects, not the instantiation of each student.
    private static int costOfCourse = 600;
    private static int id = 1000;

    Scanner scan = new Scanner(System.in);

    //CONSTRUCTOR THAT PROMPTS TO ENTER NAME AND YEAR
    public Student (){
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
    public void enroll(){
        // get inside a do while loop and user hits 0 to continue adding classes
        do {
            System.out.print("Enter course name to enroll. (Q/q to quit): ");
            String course = scan.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1!=0);
            System.out.println("Enrolled in: " + courses);
            System.out.println("Tuition balance: " + tuitionBalance);
    }

    //SHOW STATUS



}
