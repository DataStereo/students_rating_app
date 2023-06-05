import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student("Student1");
        Student student2 = new Student("Student2");
        Student student3 = new Student("Student3");

        System.out.println("Enter rating for " + student1.getName() + " > ");
        int studentRating1 = scanner.nextInt();
        student1.setRating(studentRating1);
        System.out.println("Enter rating for " + student2.getName() + " > ");
        int studentRating2 = scanner.nextInt();
        student2.setRating(studentRating2);
        System.out.println("Enter rating for " + student3.getName() + " > ");
        int studentRating3 = scanner.nextInt();
        student3.setRating(studentRating3);

        System.out.println("Average rating for all students " + Student.getAvgRating());

        boolean isStudentBetter = student1.betterStudent(student2);
        System.out.println(student1.getName() + " has better rating than " + student2.getName() + ": " + isStudentBetter);
    }
}