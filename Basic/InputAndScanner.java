package Basic;

import java.util.Scanner;

public class InputAndScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Type string:");
        String scannedString = sc.next();
        System.out.print("Type integer:");
        int scannedInt = sc.nextInt();
        System.out.print("Type boolean:");
        boolean scannedBool = sc.nextBoolean();

        // Print
        System.out.println(scannedString);
        System.out.println(scannedInt);
        System.out.println(scannedBool);
        
        // parsing
        try {
            int x = Integer.parseInt(scannedString);
            System.out.println("Your number is:" + x);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("You typed not a number!!");
        }
    }
}
