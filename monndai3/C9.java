package monndai3;

import java.util.Scanner;

public class C9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("半径:");
        double r = stdIn.nextDouble();

        System.out.println(3.14 * r * r);
    }
}
