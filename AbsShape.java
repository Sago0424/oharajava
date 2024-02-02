abstract class AbsShape {
    
        // フィールド定義
        // 図形の種類
        private int shapeType;
        private String[] shapeTypeStr = {"三角形","四角形","円"};
      
        // この図形の種類の文字列を返却するメソッド
        String getShapeTypeStr(){
          return shapeTypeStr[shapeType];
        };
        // shapeTypeのセッター
        void setShapeType(int num){
          shapeType = num;
        }
        // shapeTypeのゲッター
        int getShapeType(){
          return shapeType;
        };
      
        // 抽象メソッド定義
        // 面積を計算して返却する抽象メソッド
        abstract double calcArea();
        // 図形のデータを表示する抽象メソッド
        abstract void displayData();
      }
      
      
      /**
        三角形クラスの定義
      */
//       public class Triangle  {
//         // フィールド定義
//         private double bottom; //底辺
//         private double height; //高さ
//         // コンストラクタ定義
//         public Triangle(double bottom,double height) {
//           // 抽象クラスから継承されたshapeTypeに三角形を意味する0を代入する
//           this.setShapeType(0);
//           // 底辺を代入
//           this.bottom = bottom;
//           // 高さを代入
//           this.height = height;
//         }
      
//         //ゲッターとセッターを定義
//         public double getBottom() {
//           return bottom;
//         }
//         public double getHeight() {
//           return height;
//         }
//         public void setBottom(double bottom) {
//           this.bottom = bottom;
//         }
//         public void setHeight(double height) {
//           this.height = height;
//         }
      
//         // 抽象メソッドのオーバーライド
//         // 面積を計算して返却する
//         public double calcArea(){
//           //三角形の面積の求め方は、底辺×高さ÷2
//           //小数点第3位を四捨五入する
//           return Math.round((bottom * height / 2) * 100) / 100.0;
//         };
      
//         // 図形のデータを表示するメソッド
//         public void displayData() {
//           System.out.println("この図形は" + __(3)__ + "です。");
//           System.out.println("この図形の底辺は" + this.getBottom() + "です。");
//           System.out.println("この図形の高さは" + this.getHeight() + "です。");
//           System.out.println("この図形の面積は" + this.calcArea() + "です。");
//         }
//     }
      
      
//       未完成プログラム③　ファイル名：Circle.java
//       package kouka2;
      
//       import java.lang.Math;
      
//       /**
//         円クラスの定義
//       */
//       public class Circle __(2)__ {
//         // フィールド定義
//         private double rad; //半径
//         // コンストラクタ定義
//         public Circle(double rad) {
//           // 抽象クラスから継承されたshapeTypeに円を意味する2を代入する
//           this.setShapeType(2);
//           // 半径を代入
//           this.rad = rad;
//         }
      
//         //ゲッターとセッターを定義
//         public double getRad() {
//           return rad;
//         }
//         public void setRad(double rad) {
//           this.rad = rad;
//         }
      
//         // 抽象メソッドのオーバーライド
//         // 面積を計算して返却する
//         public double calcArea(){
//           //円の面積の求め方は、半径×半径×円周率
//           //小数点第3位を四捨五入する
//           return Math.round((Math.pow(rad, 2) * Math.PI) * 100) / 100.0;
//         };
      
//         // 図形のデータを表示するメソッド
//         public void displayData() {
//           System.out.println("この図形は" + __(3)__ + "です。");
//           System.out.println("この図形の半径は" + this.getRad() + "です。");
//           System.out.println("この図形の面積は" + this.calcArea() + "です。");
//         }
//       }
      
//       未完成プログラム④　ファイル名：Kouka3.java
//       package kouka2;
      
//       public class Kouka3 {
//         public static void main(String[] args) {
//           // 底辺10.5高さ5.0のtriangleインスタンスを生成
//           AbsShape triangle = new Triangle(10.5, 5.0);
//           // 半径8.4のCircleインスタンスを生成
//           AbsShape circle = new Circle(8.4);
//           // triangleインスタンスのdisplayDataメソッドを呼び出す
//           triangle.displayData();
//           // circleインスタンスのdisplayDataメソッドを呼び出す
//           circle.displayData();
//         }
//       }
      
// }
