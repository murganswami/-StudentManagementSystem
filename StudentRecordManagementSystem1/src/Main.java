import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sm = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Student Record Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Sort by Marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();  // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    sm.addStudent(new Student(roll, name, dept, marks));
                    break;

                case 2:
                    System.out.print("Enter Roll No to remove: ");
                    sm.removeStudent(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    sm.searchStudent(sc.nextInt());
                    break;

                case 4:
                    sm.displayAll();
                    break;

                case 5:
                    sm.sortByMarks();
                    break;

                case 0:
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
