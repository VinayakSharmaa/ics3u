package day1;

public class ExampleTwo {
    public static void main(String[] args) {
        String str = "This is a String type"; // str is a String type.

        System.out.println(str);

        int numStudents = 14; // variables use camelCase naming convention

        System.out.println(numStudents);

        double temperature = 21.7; // double is for floating point decmials, has twice the precision
        System.out.println(temperature);

        double x = 9;
        System.out.println(x);

        boolean hasShoes = true;
        System.out.println(hasShoes);

        int a = 8, b = 9, c; // declare a variable BEFORE you use it
        c = (a+b);
        System.out.println(a+b);
        // System.out.println(c); c is not initialised it is an error
        System.out.println(c);

        a = 10;

        final double PI = 3.14; // final means it is a constant variable, unable to be changed.

        // PI = 8.1; cannot change PI

        final int NUM_SUITS = 4; 

        

    }

}
