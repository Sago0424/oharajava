package monndai14;

import java.util.Scanner;

public class M4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1つ目も文字を入力："); 
        String s1 = scanner.next();

        System.out.println("2つ目の文字を入力：");
        String s2 = scanner.next();

        if (s1.equals(s2))
            System.out.println("同じ文字です");
        else
            System.out.println("違うう文字です");
        
        

    }
}
