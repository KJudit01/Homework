import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) {
            System.err.println("Invalid number! Try again!");
            System.exit(0);
        }
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        scan.close();
    }
}