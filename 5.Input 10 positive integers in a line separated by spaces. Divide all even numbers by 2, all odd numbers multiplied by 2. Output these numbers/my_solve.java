import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n =10;
        //inputting in array
        Scanner s = new Scanner(System.in);
        int a[] = new int[n];
        System.out.println("Enter "+n+" integers:");
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        //EVEN DIVIDED BY 2 & ODD MULTIPLIED BY 2
        for(int i = 0 ; i < n ; i++) {
            if(a[i] % 2 == 0) {
               a[i] = a[i] / 2;
            }
            else {
                a[i] = a[i] * 2;
            }
        }
        //PRINT
        System.out.println("My Output:");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
