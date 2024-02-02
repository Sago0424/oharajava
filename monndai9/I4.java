package monndai9;

import java.util.Scanner;
public class I4 {
    


    // 整数を3倍にする関数
    static int multiplyByThree(int num) {
        return num * 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザから整数を入力
        System.out.print("整数を入力してください：");
        int userInput = scanner.nextInt();

        // 入力された整数の9倍を計算
        int result = multiplyByThree(userInput);

        // 結果を表示
        System.out.printf("%d の 9 倍は %d です。\n", userInput, result);

        scanner.close();
    }
}


