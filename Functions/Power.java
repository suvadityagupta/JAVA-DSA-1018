package Functions;
// import java.util.*;


// public class Power {
//    public static void main(String args[]) {
//        System.out.println("Enter x");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println("Enter n");
//        int n = sc.nextInt();


//        int result = 1;
//        //Please see that n is not too large or else result will exceed the size of int
//        for(int i=0; i<n; i++) {
//            result = result * x;
//        }


//        System.out.println("x to the power n is : "+ result);
//    }   
// }

import java.util.Scanner;

public class Power {
    public static void calpower(int x, int n) {
        int result = 1;
        for(int i = 0; i<n; i++){
            result = result * x;
            
        }
        System.out.println("The product will be:" + result);
        
    }
    public static void main(String[] args) {
        System.out.println("Put the number and the power for the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        calpower(x, n);

    }
    
}
