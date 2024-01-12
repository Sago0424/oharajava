package monndai7;

import java.util.Scanner;

public class G3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int x;
        do {
            System.out.print("正の整数値:");
            x = stdIn.nextInt();
        } while (x <= 0);

        while (x > 0) {
            System.out.print(x % 10);
            x /= 10;
        }
    }
}
