package monndai3;

import java.util.Scanner;

public class C14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in,"Shift-JIS");

        System.out.print("縦の長さ:");
        double x = stdIn.nextDouble();
        

        System.out.print("横の長さ:");
        double y = stdIn.nextDouble();



        System.out.println("長方形の面積 =" + x * y );
        stdIn.close();
    }
}
