import java.util.Scanner;
public class Main{
public static void main(String[]args){
    int count=0;
    int sum=0;
    int n;
    Scanner put = new Scanner(System.in);
    System.out.println("Input integers *use ZERO or NEGATIVE for break");
    System.out.println(":");
    while(true) {
        n = put.nextInt();
        if(0 == n || n < 0){
        break;
        }
        else{
            count += 1;
            if ((n % 2) != 0) {
                sum += n;
            }
        }
    }
    System.out.println("Sum of odd numbers are : " +sum);

        }
}
