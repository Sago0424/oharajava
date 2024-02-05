package ZUKAN;

// GKクラスSoccerPlayerを継承
class GK implements SoccerPlayer {
    private String name;
    private String country;
    private int jerseyNumber;

    // コンストラクタ
    public GK(String name, String country, int jerseyNumber) {
        this.name = name;
        this.country = country;
        this.jerseyNumber = jerseyNumber;
    }

    // 名前を取得するメソッドの実装
    @Override
    public String getName() {
        return name;
    }

    // 詳細情報を取得するメソッドの実装
    @Override
    public String getDescription() {
        return "名前: " + name + ", 国: " + country + ", ポジション: ゴールキーパー \n背番号" + jerseyNumber;

    }
}

