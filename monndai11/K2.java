package monndai11;

public class K2 {
    class OperationExecutor {
        static int x; // クラス変数 x
        static int y; // クラス変数 y
    
        // 合計を求めるメソッド
        static int calculateSum() {
            int sum = 0;
            for (int i = x; i <= y; i++) {
                sum += i;
            }
            return sum;
        }
    }
    
    class Main2 {
        public static void main(String[] args) {
            // x, y に値を代入
            OperationExecutor.x = 100;
            OperationExecutor.y = 200;
    
            // 合計
            int result = OperationExecutor.calculateSum();
    
            
            System.out.printf("%d から %d までの合計値は %d です。\n", OperationExecutor.x, OperationExecutor.y, result);
        }
    }
    
}
