package Basic;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Input two number!!");
        System.out.print("First: ");
        int a = sc.nextInt();
        System.out.print("Second: ");
        int b = sc.nextInt();

        // condition
        if(a > b)
        {
            System.out.println("First one is larger than second one.");
        } 
        else if(a == b)
        {
            System.out.println("First one is equal to second one.");
        }
        else 
        {
            System.out.println("First one is smaller than second one.");
        }
    }
}
