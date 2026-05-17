import java.util.Scanner;
class Student {
    String name;
    double m1, m2, m3, avg;
    char grade;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter marks of 3 subjects: ");
        m1 = sc.nextDouble();
        m2 = sc.nextDouble();
        m3 = sc.nextDouble();
    }

    void calculate() {
        avg = (m1 + m2 + m3) / 3;

        if(avg >= 75)
            grade = 'A';
        else if(avg >= 60)
            grade = 'B';
        else if(avg >= 50)
            grade = 'C';
        else
            grade = 'F';
    }

    void display() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }}
public class StudentGradeSystem {
    public static void main(String[] args) {
        Student s = new Student();

        s.input();
        s.calculate();
        s.display();
    }
}
