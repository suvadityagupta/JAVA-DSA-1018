package Functions;

import java.util.Scanner;

public class Fibonacci {
    public static void calNFibonacci(int n) {
        int a = 0;
        int b = 1;
        if (n > 1) {
            for(int i = 1; i<=n; i++){
                System.out.println(a + " ");
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calNFibonacci(n);
        
    }
}
