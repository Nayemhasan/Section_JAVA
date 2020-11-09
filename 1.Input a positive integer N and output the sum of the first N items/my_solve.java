import java.util.Scanner;
public class Main {
    static double sum(int n)
    {
        double i, s = 0.0;
        for (i = 1; i <= n; i++)
            s = s + 1/i;
        return s;
    }
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        int n;
        System.out.print("Input : ");
        n = put.nextInt();
        System.out.printf("Sum is %.2f", sum(n));
    }
}
