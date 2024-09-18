package day3;

public class ExampleTwo {
    public static void main(String[] args) {
        int numStudents = 15;

        numStudents++;
        ++numStudents;

        int y = 10;
        y = numStudents++; // uses numStudents and then adds 1; y = 17
        y = ++numStudents; // adds 1 to numStudents and then uses it; y = 18

    }

}
