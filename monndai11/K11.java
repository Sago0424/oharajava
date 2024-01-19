package monndai11;

import java.util.Scanner;

class K11 {
    static final double PI = 3.1415;
    //円の半径を格納する変数
    private double radius;
    
    public K11(double radius) {
        this.radius = radius;
    }

    //円周の長さを計算する
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    //面積を計算する
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }
}

class Main {
    public static void main(String[] args) {
        //入力させる
        Scanner scanner = new Scanner(System.in);
        System.out.print("半径を整数値で入力：");
        double radius = scanner.nextDouble();

        
        K11 circleInstance = new K11(radius);

        
        double circumferenceResult = circleInstance.calculateCircumference();        
        double areaResult = circleInstance.calculateArea();
        //%3で小数第3位までの結果を表示
        System.out.printf("円周の長さは %.3f です。\n", circumferenceResult);
        System.out.printf("円の面積は %.3f です。\n", areaResult);
        
        
        scanner.close();
    }
}

