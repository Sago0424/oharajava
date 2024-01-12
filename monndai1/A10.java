package monndai1;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in,"Shift-JIS");

        System.out.print("文字の入力:");
        String str = stdIn.next();

        System.out.print("整数の入力:");
        String abc = stdIn.next();

        System.out.print("小数の入力:");
        String sss = stdIn.next();

        System.out.println("入力された文字 =" + str );
        System.out.println("入力された整数 =" + abc );
        System.out.println("入力された少数 =" + sss );
        stdIn.close();
    }

}
