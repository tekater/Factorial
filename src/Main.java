import java.util.Scanner;
public class Main {
    public static long factorial(int n) {
        long sum = 1;
        for (int i=1; i <= n; i++) {
            sum = n*factorial(n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}