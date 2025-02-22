package iteration05;
import java.util.Scanner;

public class whileSum {
    public static void main(String[] args) {
        int sum = 0;
        boolean keepGoing = true;

        while (keepGoing) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number (negative number to exit) --> ");
            int n = sc.nextInt();

            if (n < 0) {
                keepGoing = false;
            }
            else {
                sum = sum + n;
            }
        System.out.println("Sum of number is: " +sum);
        }
    }
}
