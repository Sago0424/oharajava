package monndai14;
import java.util.Scanner;
class M2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("文字列を入力：");
        String s = scanner.next();
        
        int length = s.length();
        
        System.out.println("文字数；" + length);
    }
}


