package monndai13_1;

    // 抽象クラス Person
abstract class Person {
    protected String name;
    protected String job;

    // コンストラクタ
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    // 抽象メソッド introduce
    public abstract void introduce();
}

// 教員クラス Teacher
class Teacher extends Person {
    private String subject;

    // コンストラクタ
    public Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    // introduceメソッドの実装
    @Override
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当科目：" + subject);
    }
}

// シェフクラス Cook
class Cook extends Person {
    private String specialty;

    // コンストラクタ
    public Cook(String name, String job, String specialty) {
        super(name, job);
        this.specialty = specialty;
    }

    // introduceメソッドの実装
    @Override
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialty);
    }
}

class Main {
    public static void main(String[] args) {
        // 教員のインスタンス生成
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        teacher.introduce(); // 教員の情報を表示

        // シェフのインスタンス生成
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");
        cook.introduce(); // シェフの情報を表示
    }
}

