class Student {
    // Static variable to store the university name, shared by all students
    private static String universityName = "RGPV University";

    // Final variable to store the roll number, which cannot be changed once assigned
    private final int rollNumber;

    private String name;
    private String grade;

    // Constructor to initialize a student with roll number, name, and grade
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    // Method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) { // Checking if the current object is an instance of Student
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

// Main class to test the Student class
public class UniversityManagement {
    public static void main(String[] args) {
        // Creating student objects with roll number, name, and grade
        Student stu1 = new Student(101, "Aman", "A");
        Student stu2 = new Student(102, "Adarsh", "B");

        // Displaying details of the first student
        stu1.displayStudentDetails();

        // Displaying details of the second student
        stu2.displayStudentDetails();
    }
}
