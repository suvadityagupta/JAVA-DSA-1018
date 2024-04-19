package Functions;

import java.util.Scanner;

public class Greatest {
    public static void calGreatest(int a, int b) {
        if (a > b) {
            System.out.println( a + " is the greatest among two"); 
        }else{
            System.out.println(b + " is greater among these two numbers");
        }
    }
    public static void main(String[] args) {
        System.out.println("Put two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calGreatest(a, b);
    }
}
//with less time and space complexity 
// import java.util.Scanner;


// public class Greatest {
//    public static int calGreatest(int a, int b) {
//       if(a > b) {
//           return a;
//       } else {
//           return b;
//       }
//    }
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       System.out.println(calGreatest(a, b));
//    }   
// }
