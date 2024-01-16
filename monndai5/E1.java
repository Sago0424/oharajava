package monndai5;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner stdIn  = new Scanner(System.in);

        System.out.print("A~Dの値を入力してください:");
        String ranku = stdIn.next();

        switch (ranku) {
            case "A":
                System.out.println("ランクAは評価「優」です"); break;
            case "B":
                System.out.println("ランクBは評価「良」です"); break;
            case "C":
                System.out.println("ランクC評価は「可」です"); break;
            case "D":
                System.out.println("ランクDは評価「不可」です"); break;
            default:
                System.out.println("無効な入力です。A~Dの値を入力してください");
        }
    }
    
}
