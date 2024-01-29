package monndai15;

import java.util.Scanner;
public class O1 {
    public static void main(String[] args) {
        // スキャナーの作成
        Scanner scanner = new Scanner(System.in);
    
        try {
            // 整数1の入力
            System.out.print("整数1 = ");
            int num1 = Integer.parseInt(scanner.nextLine());

            // 整数2の入力
            System.out.print("整数2 = ");
            int num2 = Integer.parseInt(scanner.nextLine());
            
            // 割り算の実行
            double result = num1 / num2;

            // 結果の表示
            System.out.printf("%d / %d = %.0f%n", num1, num2, result);

        
        } catch (ArithmeticException e) {
            // 0で割った場合の例外処理
            System.out.println("0による割り算です");

        } finally {
            // スキャナーのクローズ
            scanner.close();

            System.out.println("処理終了");
        }
    }
}

