// public class Human {
//     protected String name;    // 名前
//   protected int age;        // 年齢

//   // コンストラクタ定義
//   public Human(String name, int age) {
//     this.name = name;
//     this.age = age;
//   }

//   // メソッド定義
//   // 挨拶を表示するメソッド
//   public void greeting() {
//     System.out.println("Hello.");
//   }

//   // 自己紹介するメソッド
//   public void introduction() {
//     // 挨拶する
//     greeting();
//     // 名前と年齢を表示する
//     System.out.println("私は、" + this.name + "です。");
//     System.out.println("年齢は、" + this.age + "です。");
//   }
// }


// /**
//   日本人クラスの定義
// */
// class Japanese extends Human {
//   // フィールド定義
//   protected String nation = "日本人"; //国籍

//   // コンストラクタ定義
//   public Japanese(String name, int age) {
//     // 親クラスのコンストラクタを呼び出して名前と年齢を設定する
//     super(name, age);
//   }

//   // メソッド定義
//   // 挨拶を表示するメソッド（オーバーライド）
//   public void greeting() {
//     // 日本語の挨拶をする
//     System.out.println("こんにちは");
//   }

//   // 自己紹介するメソッド（オーバーライド）
//   public void introduction() {
//     // 親クラスのintroductionメソッドを呼び出す
//     super.introduction();
//     // 国籍を表示する
//     System.out.println(this.nation + "です。");
//   }
// }
// class Kouka2 {
//   public static void main(String[] args) {
//     // コンストラクタを呼び出しJapaneaseインスタンスを生成
//     Human suzuki = new Japanese("鈴木　一郎", 28);
//     // suzukiインスタンスのintroductionメソッドを呼び出す
//     suzuki.introduction();
//   }
// }


