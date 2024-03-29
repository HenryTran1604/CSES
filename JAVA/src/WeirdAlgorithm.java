import java.util.Scanner;

public class WeirdAlgorithm {
    public static void solve(long n) {
        while(n != 1) {
            System.out.print(n + " ");
            if(n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
        }
        System.out.println(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        solve(n);

    }
}
