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
        System.out.println("Enter DOB (yyyy-mm-dd): ");
        String dob = sc.nextLine();
        System.out.println("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student added successfully!");
    }

    // method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display!");
            return;
        }
        for (Student student : students) {
            student.displayStudentDetails();
        }
    }

    // method to search student by PRN
    public void searchStudentByPrn(Scanner sc) {
        System.out.print("Enter PRN to search: ");
        int prn = sc.nextInt();

        for (Student student : students) {
            if (student.getPrn() == prn) {
                student.displayStudentDetails();
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
}
