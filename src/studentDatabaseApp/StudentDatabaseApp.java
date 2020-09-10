package studentDatabaseApp;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        //ask how many new students to add
        student1.enroll();
        student1.viewTuitionBalance();
        student1.payTuition();
        System.out.println(student1.showInfo());

    }
}
