import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //inputting in array
        System.out.print("Input two positive integers m and n (1≤m, n≤6):");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sumoftherows = 0;

        System.out.println("Enter array elements now : ");
        int[][] twoD = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }
        //sum of rows
        System.out.println("My Output: ");
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                sumoftherows += twoD[i][j];
            }
            System.out.println(sumoftherows);
            sumoftherows = 0;
        }
    }
}
