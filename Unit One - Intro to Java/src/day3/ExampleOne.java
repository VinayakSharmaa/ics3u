package day3;

public class ExampleOne {
 public static void main(String[] args) {
    int x = 7;
    int y = 12;

    x = x + 3; // x gets assigned x + 3, making it 10

    y = y - 2;

    x /= 2; // same as x = x / 2;

    // divide y by 4 and store the remainder in y
    y %= 4; // is the same as y = y % 4. % is modulus, gets the remainder after dividing y by 4, 10/4 remainder is 2.

    x++; // adds 1 to x
    y--; // subtracts 1 from y
 }
}
