package Udemy_course_projects.bankAcctApp.studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private int tuitionBalance = 0;
    private String studentID;
    //need to initialize so courses won't be null
    private String courses = "";
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
        //this clears the scanner of any whitespace so the first sout of the do/while doesn't print twice.
//        String quit = courses.equalsIgnoreCase("q");
        scan.nextLine();
        // get inside a do while loop and user hits 0 to continue adding classes
        boolean quit = false;
        do {
            System.out.println("Enter course code to enroll (Q/q to quit):\nCourse codes:  M101 - Mathematics 101\nH101 - History 101\nE101 - English 101\nCh101 - Chemistry 101\nCS101 - Computer Science 101");
            String course = scan.nextLine();
            switch (course) {
                case "M101":
                case "H101":
                case "E101":
                case "Ch101":
                case "CS101":
                case "m101":
                case "h101":
                case "e101":
                case "ch101":
                case "cs101":
                case "Cs101":
                    courses = courses + "\n" + course;
                    tuitionBalance += costOfCourse;
                    quit = false;
                    break;
                default:
                    quit = true;
                    break;
                }
//            System.out.println("Enrolled in: " + courses);

        } while (quit == false);

    }

    //VIEW BALANCE
public void viewTuitionBalance(){
        System.out.println("Tuition balance: $" + tuitionBalance + ".00");
//        return "Tuition balance: " + tuitionBalance;
}
    //PAY TUITION
    public void payTuition() {
        System.out.println("Please enter the amount you'd like to pay: ");
        int payment = scan.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment + ".00.");
        viewTuitionBalance();
    }

    //SHOW STATUS - COULD ALSO USE THE "TO STRING METHOD"
    public String showInfo() {
        return "Name: "  + firstName + " " + lastName + '\n' +
                "Student ID: " + studentID + '\n' +
                "Grade Level: " + gradeLevel + "\n" +
                "Currently Enrolled Courses: " + "  " + courses + '\n' +
                "Tuition Balance: $" + tuitionBalance + ".00.";
    }
}
