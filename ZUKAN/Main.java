package ZUKAN;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SoccerPlayerEncyclopedia encyclopedia = new SoccerPlayerEncyclopedia();
        encyclopedia.addPlayer(new Forward("クリスティアーノ・ロナウド", "ポルトガル", 7));
        encyclopedia.addPlayer(new Midfielder("リオネルメッシ", "アルゼンチン", 10));
        encyclopedia.addPlayer(new Forward("エムバぺ", "フランス", 10));
        encyclopedia.addPlayer(new Forward("ティアゴ・アルカンタラ", "イタリア", 10));
        encyclopedia.addPlayer(new Forward("アントワーヌ・グリーズマン", "フランス",0));
        encyclopedia.addPlayer(new Forward("エデン・アザール", "ベルギー", 10));
        encyclopedia.addPlayer(new Midfielder("パウロ・ディバラ", "アルゼンチン", 8));
        encyclopedia.addPlayer(new Forward("ハリー・ケイン", "イングランド", 10));
        encyclopedia.addPlayer(new Midfielder("ブルーノフェルナンデス", "オランダ", 10));
        encyclopedia.addPlayer(new Forward("ソン・フンミン", "韓国", 13));
        encyclopedia.addPlayer(new GK("オリバーカーン", "ドイツ", 10));

        int choice;
        do {
            // メニューの表示
            System.out.println("1. 一覧表示");
            System.out.println("2. 選手の詳細表示");
            System.out.println("3. 終了");

            try {
                System.out.print("選択してください: ");
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                // 数字以外が入力された場合のエラーハンドリング
                System.err.println("無効な入力です。数字を入力してください。");
                scanner.nextLine(); // 不正な入力をクリア
                choice = 0; // ループを継続
            }

            switch (choice) {
                case 1:
                    // 一覧表示
                    encyclopedia.displayPlayers();
                    break;
                case 2:
                    // 選手の詳細表示
                    System.out.print("選手の番号を入力してください: ");
                    try {
                        int playerIndex = scanner.nextInt();
                        SoccerPlayer selectedPlayer = encyclopedia.getPlayer(playerIndex - 1);
                        System.out.println("選手の詳細情報:");
                        System.out.println(selectedPlayer.getDescription());
                    } catch (InputMismatchException | IndexOutOfBoundsException e) {
                        // 数字以外が入力された場合やインデックスが範囲外の場合のエラーハンドリング
                        System.err.println("選手が見つかりませんでした。");
                        scanner.nextLine(); // 不正な入力をクリア
                    }
                    break;
                case 3:
                    // 終了
                    System.out.println("アプリケーションを終了します。");
                    break;
                default:
                    System.out.println("無効な選択です。もう一度選んでください。");
            }
        } while (choice != 3);

        scanner.close();
    }
}


