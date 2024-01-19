package monndai8;

public class H8_5 {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
    
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
    
            double average = (double) sum / array.length;
    
            
            System.out.println("合計値は " + sum + " です。");
            System.out.println("平均値は " + average + " です。");
        }
    }
    
