package monndai13;

public class Main {
    public static void main(String[] args) {
        // Teacher インスタンス生成と情報表示
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        System.out.println("教員の情報：");
        teacher.introduce();
        System.out.println();

        // Cook インスタンス生成と情報表示
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");
        System.out.println("シェフの情報：");
        cook.introduce();
    }
}


