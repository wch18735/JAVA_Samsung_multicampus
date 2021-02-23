package Basic;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input case number: ");
        int num = sc.nextInt();

        int[] newIntArr = new int[num];
        String[] newStringArr = new String[num];

        for(int i = 0; i < num; i++)
        {
            System.out.print("Input int: ");
            newIntArr[i] = sc.nextInt();
            System.out.print("Input string: ");
            newStringArr[i] = sc.next();
        }

        for(int i = 0; i < num; i++)
        {
            System.out.println("Input index " + (i + 1) + " " + newIntArr[i] + " " + newStringArr[i]);
        }
    }
}
