import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 10");
        int number = sc.nextInt();
        final int TWO = 2;

        switch(number){
            case 1: case 3: case 5:
            case 7: case 9:
                System.out.println(number + " is odd ");
                break;
            case TWO:
            case 4: case 6: case 8: case 10:
                System.out.println(number + " is even ");
                break;
            default:
                System.out.println(number + " is outside range (1 - 10)");
                break;
        }
    }
}
