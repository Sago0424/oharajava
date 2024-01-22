package monndai11;

public class K3 {
        int x; // インスタンス変数 x
        int y; // インスタンス変数 y
    
        // コンストラクタで x, y の初期化
        //K3が同じ
        //戻り値がない
        public K3(int x, int y) {
            this.x = x;
            this.y = y;
        }
    
        // 合計を求めるメソッド
        int calculateSum() {
            int sum = 0;
            for (int i = x; i <= y; i++) {
                sum += i;
            }
            return sum;
        }
    }
    
class Main3 {
        public static void main(String[] args) {
            // 演算実行クラスのインスタンスを生成し、x, y に値を代入
            K3 executor = new K3(100, 200);
    
            // 合計を求める
            int result = executor.calculateSum();
    
            
            System.out.printf("%d から %d までの合計値は %d です。\n", executor.x, executor.y, result);
        }
    }
    