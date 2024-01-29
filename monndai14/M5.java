package monndai14;

public class M5 {
    public static void main(String[] args) {
        
        String str1 = "東京都千代田区";

        String str2 = "神田神保町";

        StringBuilder a = new StringBuilder(str1);

        a.append(str2);

        System.out.println(a);
    }
}
