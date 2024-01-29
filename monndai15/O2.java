package monndai15;
import java.util.InputMismatchException;
import java.util.Scanner;
public class O2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("整数を入力 = ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " は偶数");
            } else {
                System.out.println(number + " は奇数");
            }
        } catch (InputMismatchException e) {
            System.out.println("整数と認識できません！！");
        } finally {
            scanner.close();
    }
}

}