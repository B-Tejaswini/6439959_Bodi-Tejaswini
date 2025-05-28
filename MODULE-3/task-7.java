public class TypeCastingExample {
    public static void main(String[] args) {

        double myDouble = 9.75;

     
        int myIntFromDouble = (int) myDouble;


        System.out.println("Original double value: " + myDouble);
        System.out.println("After casting to int: " + myIntFromDouble);

 
        int myInt = 42;


        double myDoubleFromInt = (double) myInt;

 
        System.out.println("Original int value: " + myInt);
        System.out.println("After casting to double: " + myDoubleFromInt);
    }
}