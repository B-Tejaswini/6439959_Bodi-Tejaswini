import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        
        String reversed1 = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed1 += input.charAt(i);
        }
        System.out.println("Reversed string (using loop): " + reversed1);

        String reversed2 = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string (using StringBuilder): " + reversed2);

        sc.close();
    }
}