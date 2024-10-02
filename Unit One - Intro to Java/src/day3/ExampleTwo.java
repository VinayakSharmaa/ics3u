package day3;

public class ExampleTwo {
    public static void main(String[] args) {
        int numStudents = 15;

        numStudents++;
        ++numStudents;

        int y = 10;
        y = numStudents++; // uses numStudents and then adds 1; y = 17
        System.out.println(y);
        y = ++numStudents; // adds 1 to numStudents and then uses it; y = 18
        System.out.println(y);

        

        double a = 4.5;
        int b = (int) a * 2;
        System.out.println(b);
    }

}
