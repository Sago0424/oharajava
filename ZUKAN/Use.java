package ZUKAN;

import java.util.InputMismatchException;
import java.util.Scanner;
class Use {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SoccerPlayerEncyclopedia encyclopedia = new SoccerPlayerEncyclopedia();
        encyclopedia.addPlayer(new Forward("クリスティアーノ・ロナウド","ポルトガル", 7));
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
        encyclopedia.addPlayer(new Midfielder("ネイマール", "ブラジル", 10));
        encyclopedia.addPlayer(new GK("レオ・イギータ", "コロンビア", 99));
        encyclopedia.addPlayer(new GK("ケイラー・ナバス", "スペイン", 99));
        encyclopedia.addPlayer(new GK("イケル・カシージャス", "スペイン", 99));

        int choice;
        do {
            // メニューの表示
            System.out.println(" ");
            System.out.println("サッカー選手図鑑");
            System.out.println("1. 一覧表示");
            System.out.println("2. 選手の詳細表示");
            System.out.println("3. 終了");
            System.out.println(" ");

            try {
                System.out.print("選択してください: ");
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                // 数字以外が入力された場合のエラーハンドリング
                System.err.println("無効な入力です。数字を入力してください。");
                // 不正な入力をクリア
                scanner.nextLine();
                 // ループを継続
                choice = 0; 
            }

            switch (choice) {
                case 1:
                    // 一覧表示
                    System.out.println("選手一覧を表示します");
                    encyclopedia.displayPlayers();
                    break;
                case 2:
                    // 選手の詳細表示
                    System.out.print("選手の番号を入力してください: ");
                    try {
                        int playerIndex = scanner.nextInt();
                        SoccerPlayer selectedPlayer = encyclopedia.getPlayer(playerIndex - 1);
                        System.out.println(playerIndex + "番ですね！");
                        System.out.println("選手の詳細情報:");
                        System.out.println(selectedPlayer.getDescription());
                    } catch (InputMismatchException | IndexOutOfBoundsException e) {
                        // 数字以外が入力された場合やインデックスが範囲外の場合のエラーハンドリング
                        System.err.println("選手が見つかりませんでした。");
                        // 不正な入力をクリア
                        scanner.nextLine(); 
                    }
                    break;
                case 3:
                    // 終了
                    System.out.println("アプリケーションを終了します。おつかれーい");
                    break;
                default:
                    System.out.println("無効な選択ですね。もう一度選んでーーー。");
            }
        } while (choice != 3);

        scanner.close();
    }
}

