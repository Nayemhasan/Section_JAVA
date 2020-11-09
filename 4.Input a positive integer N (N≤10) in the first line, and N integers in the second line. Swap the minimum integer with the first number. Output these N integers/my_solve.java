import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,pos = 0;
        int temp,min;
        //inputting in array
        Scanner s = new Scanner(System.in);
        System.out.print("Input a positive integer N(N≤10) for inputs: ");
        System.out.println();
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" integers:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        //finding the minimum
        min = a[0];
        for(int i = 0; i < n; i++)
        {
            if(a[i] < min)
                min = a[i];
        }
       //getting the minimums index
        int value = min;
        for(int i = 0; i < n ; i++)
        {
            if (a[i] == value)
                pos = i;
        }
       //swapping
            temp = a[0];
            a[0] = a[pos];
            a[pos] = temp;
       //printing
        System.out.println("My Output:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
            }
        }
    }
