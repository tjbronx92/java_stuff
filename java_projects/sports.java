import java.util.Scanner;
public class sports {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sport --> ");
        String sport = sc.next();

        switch(sport){
            case "Soccer":
                System.out.println("I play Soccer");
                break;
            case "Rugby":
                System.out.println("I play Rugby");
                break;
            case "Football":
                System.out.println("I play Football");
                break;
            default:
                System.out.println("Unknown sport");
                break;
        }
    }
}
