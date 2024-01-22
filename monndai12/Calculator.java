package monndai12;

import java.util.Scanner;
//Calculatorはスーパークラス
class Calculator {
    //合計の計算
    public int calcSum(int num1, int num2) {
        return num1 + num2;
    }
    //平均の計算
    public double calcAve(int num1, int num2) {
        return (num1 + num2) / 2;
    }
}

//MoreCalcクラスにCalculatorクラスを継承
class MoreCalc extends Calculator {
    //累乗の計算
    public int calcPow(int base, int exponent) {
        //math.powメソッドで累乗の計算
        return (int) Math.pow(base, exponent);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください：");
        int num1 = scanner.nextInt();

        System.out.print("整数を入力してください：");
        int num2 = scanner.nextInt();
        // MoreCalc クラスのインスタンスを生成
        MoreCalc moreCalc = new MoreCalc();

        // 合計値を計算して表示
        System.out.println("Sum " + num1 + " and " + num2 + " = " + moreCalc.calcSum(num1, num2));

        // 平均値を計算して表示
        System.out.println("Average " + num1 + " and " + num2 + " = " + moreCalc.calcAve(num1, num2));

        // 累乗を計算して表示
        System.out.println("Power " + num1 + " of " + num2 + " = " + moreCalc.calcPow(num1, num2));

        scanner.close();
    }
}

