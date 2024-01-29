package monndai14;

import java.util.Scanner;
public class M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Shift-JIS");
        System.out.println("文字列を入力:");
        String str = scanner.nextLine();

        StringBuilder str2 = new StringBuilder(str);

        if (str2.length() >= 11){
            str2.setLength(10);
        }


        System.out.println("入力された文字は:" + str2.toString());
    
}
}