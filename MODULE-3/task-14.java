import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

     
        int[] numbers = new int[n];
        int sum = 0;

       
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

      
        double average = (double) sum / n;

       
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);

        sc.close();
    }
}