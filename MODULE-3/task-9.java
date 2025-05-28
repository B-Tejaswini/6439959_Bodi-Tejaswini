import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks out of 100: ");
        int marks = scanner.nextInt();


        if (marks >= 90 && marks <= 100) {
            System.out.println("Your grade is: A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Your grade is: B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Your grade is: C");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Your grade is: D");
        } else if (marks >= 0 && marks < 60) {
            System.out.println("Your grade is: F");
        } else {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }

        scanner.close();
    }
}
