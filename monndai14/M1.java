package monndai14;
import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in,"Shift-JIS");

        System.out.print("文字列を入力：");
        String str = stdIn.next();

        System.out.println(str);
        stdIn.close();
        
    }
}
