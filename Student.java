import java.util.Date;

public class Student {
    // declaring the instaance members
    private int prn;
    private String name;
    private Date dob;
    private double marks;

    // declaring constructors
    public Student(int prn, String name, Date dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }
}