package Functions;

import java.util.Scanner;

public class Vote {
    public static void calEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        calEligibility(age);
    }
    
}
