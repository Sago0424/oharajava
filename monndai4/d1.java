package monndai4;

import java.util.Scanner;

public class d1 {
   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("０～１００までの得点をを入力してください: ");

       
        int score = scanner.nextInt();
        scanner.close();

        if (score >= 80) {
            System.out.println("合格です。");
        } 
        }
    }

