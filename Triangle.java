public class Triangle extends AbsShape {
    // フィールド定義
    private double bottom; //底辺
    private double height; //高さ
    // コンストラクタ定義
    public Triangle(double bottom,double height) {
      // 抽象クラスから継承されたshapeTypeに三角形を意味する0を代入する
      this.setShapeType(0);
      // 底辺を代入
      this.bottom = bottom;
      // 高さを代入
      this.height = height;
    }
  
    //ゲッターとセッターを定義
    public double getBottom() {
      return bottom;
    }
    public double getHeight() {
      return height;
    }
    public void setBottom(double bottom) {
      this.bottom = bottom;
    }
    public void setHeight(double height) {
      this.height = height;
    }
  
    // 抽象メソッドのオーバーライド
    // 面積を計算して返却する
    public double calcArea(){
      //三角形の面積の求め方は、底辺×高さ÷2
      //小数点第3位を四捨五入する
      return Math.round((bottom * height / 2) * 100) / 100.0;
    };
  
    // 図形のデータを表示するメソッド
    public void displayData() {
      System.out.println("この図形は" + getShapeType() + "です。");
      System.out.println("この図形の底辺は" + this.getBottom() + "です。");
      System.out.println("この図形の高さは" + this.getHeight() + "です。");
      System.out.println("この図形の面積は" + this.calcArea() + "です。");
    }
  }
  
  