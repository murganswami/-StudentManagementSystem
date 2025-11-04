import java.util.*;

public class StudentManagementSystem {
    private List<Student> studentList = new ArrayList<>();
    private Map<Integer, Student> studentMap = new HashMap<>();

    // Add Student
    public void addStudent(Student student) {
        studentList.add(student);
        studentMap.put(student.getRollNo(), student);
        System.out.println("✅ Student added successfully!");
    }

    // Remove Student by Roll Number
    public void removeStudent(int rollNo) {
        Student s = studentMap.remove(rollNo);
        if (s != null) {
            studentList.remove(s);
            System.out.println("🗑️ Student removed successfully!");
        } else {
            System.out.println("❌ Student not found!");
        }
    }

    // Search Student
    public void searchStudent(int rollNo) {
        Student s = studentMap.get(rollNo);
        if (s != null)
            System.out.println("🔍 Found: " + s);
        else
            System.out.println("❌ Student not found!");
    }

    // Display All Students
    public void displayAll() {
        System.out.println("\n📋 Student List:");
        for (Student s : studentList)
            System.out.println(s);
    }

    // Sort Students by Marks
    public void sortByMarks() {
        Collections.sort(studentList, Comparator.comparingDouble(Student::getMarks).reversed());
        System.out.println("\n📊 Students sorted by marks (High → Low):");
        for (Student s : studentList)
            System.out.println(s);
    }
}
