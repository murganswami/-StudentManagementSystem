public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private String department;
    private double marks;

    public Student(int rollNo, String name, String department, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    // Getters and Setters
    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getMarks() { return marks; }

    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;  // Sort by roll number
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " (" + department + ") Marks: " + marks;
    }
}
