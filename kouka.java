import java.util.Scanner;

public class kouka {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("1教科目の点数を入力してください:");
        int a = stdIn.nextInt();


        System.out.print("2教科目の点数を入力してください:");
        int b = stdIn.nextInt();

        System.out.print("3教科目の点数を入力してください:");
        int c = stdIn.nextInt();

        System.out.print("4教科目の点数を入力してください:");
        int d = stdIn.nextInt();

        System.out.print("5教科目の点数を入力してください:");
        int e = stdIn.nextInt();

        System.out.println("合計点 = " + (a + b + c + d + e));
        System.out.println("平均点 = " + (a + b + c + d + e) / 5 );
        
        

    }
}
