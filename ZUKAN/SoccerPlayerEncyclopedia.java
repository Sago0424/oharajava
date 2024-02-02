package ZUKAN;

import java.util.ArrayList;
import java.util.List;

// サッカー選手の図鑑クラス
public class SoccerPlayerEncyclopedia {
    private List<SoccerPlayer> players = new ArrayList<>();

    // サッカー選手を追加するメソッド
    public void addPlayer(SoccerPlayer player) {
        players.add(player);
    }

    // 選手の一覧を表示するメソッド
    public void displayPlayers() {
        for (int i = 0; i < players.size(); i++) {
            System.out.println((i + 1) + ". " + players.get(i).getName());
        }
    }

    // インデックスを指定して選手を取得するメソッド
    public SoccerPlayer getPlayer(int index) {
        return players.get(index);
    }
}
