package Basic;

import java.util.Scanner;

public class While{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = sc.next();
        while(!word.equals("Exit"))
        {
            System.out.println(word);
            System.out.print("Type a word: ");
            word = sc.next();
        }
    }
}