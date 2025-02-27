import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentOperations {
    private ArrayList<Student> students;

    // constructor
    public StudentOperations() {
        students = new ArrayList<>();
    }

    // method to add student
    public void addStudent(Scanner sc) {
        System.out.println("Enter PRN: ");
        long prn = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter DOB: ");
        String dob = sc.nextLine();
        System.out.println("Enter Marks: ");
        double marks = sc.nextDouble();

}
