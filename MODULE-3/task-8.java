public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 / 2 + 3;
        int result4 = 20 / (2 + 3);
        int result5 = 10 + 5 * 2 - 4 / 2;

   
        System.out.println("Result1 (10 + 5 * 2): " + result1);
        System.out.println("Result2 ((10 + 5) * 2): " + result2);
        System.out.println("Result3 (20 / 2 + 3): " + result3);
        System.out.println("Result4 (20 / (2 + 3)): " + result4);
        System.out.println("Result5 (10 + 5 * 2 - 4 / 2): " + result5);
    }
}
