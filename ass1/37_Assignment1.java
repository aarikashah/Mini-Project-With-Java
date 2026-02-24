	import java.util.Scanner;

class Student {

    private String name;
    private int rollno;
    private int[] marks;

    Student(String name, int rollno, int[] marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += marks[i];
        }
        return sum / 3.0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("------------------------");
    }

    int[] getMarks() {
        return marks;
    }
}

public class StudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            sc.nextLine(); 

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No: ");
            int rollno = sc.nextInt();

            int[] marks = new int[5];
            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }

            students[i] = new Student(name, rollno, marks);
        }

        System.out.println("\n---- Student Details ----");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        double[] subjectAvg = new double[5];

        for (int j = 0; j < 5; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += students[i].getMarks()[j];
            }
            subjectAvg[j] = sum / (double) n;
        }

        System.out.println("---- Subject-wise Average ----");
        for (int j = 0; j < 5; j++) {
            System.out.println("Subject " + (j + 1) + " Average: " + subjectAvg[j]);
        }

        sc.close();
    }
}
