package monndai11;

import java.util.ArrayList;
import java.util.List;
public class K7 {

    //インスタンス変数nameに引数で受け取っ名前を代入ほかの4つの変数も同じ
    private String name;
    private String studentNumber;
    private int japaneseScore;
    private int mathScore;
    private int englishScore;

    // コンストラクタ
    public K7(String name, String studentNumber, int japaneseScore, int mathScore, int englishScore) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.japaneseScore = japaneseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    // 平均点を計算するメソッド
    public double calculateAverage() {
        return Math.floor((japaneseScore + mathScore + englishScore) / 3.0 * 100) / 100; // 小数点第3位以下切り捨て
    }

    // 合計点を計算するメソッド
    public int calculateTotal() {
        return japaneseScore + mathScore + englishScore;
    }

    // 学生情報を表示するメソッド
    public void displayStudentInfo() {
        System.out.printf("%s 番 %s  平均点 %.2f\n", studentNumber, name, calculateAverage());
    }
}

class Main777 {
    public static void main(String[] args) {
        // 学生情報のリストを作成
        List<K7> students = new ArrayList<>();
        students.add(new K7("A さん", "001", 89, 65, 88));
        students.add(new K7("B さん", "002", 80, 97, 64));
        students.add(new K7("C さん", "003", 70, 80, 98));

        // 学生情報を表示
        for (K7 student : students) {
            student.displayStudentInfo();
        }
    }
}


