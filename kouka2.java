
import java.util.Scanner;
public class kouka2 {
    
    public static void main(String[] args) {
        //パスワードを入力させる
        System.out.print("現在のパスワードを入力してください: ");

        //初期化
        Scanner scanner = new Scanner(System.in);
        String originalPassword = scanner.nextLine();

        StringBuilder newPasswordBuilder = new StringBuilder(originalPassword);
        //reverseで逆にして表示
        newPasswordBuilder.reverse();
        String newPassword = newPasswordBuilder.toString();

        System.out.println("セキュリティー上の問題を発見しました。\nセキュリティーを強化したパスワードを作成しました\nこちらをお使いください");
        System.out.println("強力なセキュリティのパスワード: " + newPassword);

       
        scanner.close();
    }
}

