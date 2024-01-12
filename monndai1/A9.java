package monndai1;

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in,"Shift-JIS");

        System.out.print("お名前を入力してください");
        String str = stdIn.next();

        System.out.println("こんにちわ" + str + "さん");
        stdIn.close();
        
    }
    
}
