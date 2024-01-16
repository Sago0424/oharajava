package monndai7;

public class G4 {
    public static void main(String[] args) {
        int target = 100000;
        int n = 1;
        int sum = 0;

        while (sum <= target) {
            sum += n;
            n++;
        }

        System.out.println("合計が " + target + " を超える n は " + (n - 1) + " です");
    }
}
