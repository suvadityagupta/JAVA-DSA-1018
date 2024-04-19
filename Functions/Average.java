package Functions;

import java.util.Scanner;

public class Average {
    public static void calAvg(int a, int b, int c) {
        float avg = (float)(a + b + c)/3;
        System.out.println("Average will be: " + avg);
    
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        calAvg(a, b, c);
    }
    
}
