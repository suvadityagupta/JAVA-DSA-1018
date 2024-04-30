package Recursion;

// public class Fibonacci {
//     public static void printFib(int a, int b, int n) {
//         if (n==0) {
//             return;            
//         }
//         int c = a + b;
//         System.out.println(c);
//         printFib(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         int a = 0;
//         int b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         printFib(a, b, n-2);        
//     }
// }
class Fibonacci {
    public static void printFactorial(int a, int b, int n) {
    if(n == 0) {
    return;
    }
    System.out.println(a);
    printFactorial(b, a+b, n-1);
    }
    public static void main(String args[]) {
    printFactorial(0, 1, 7);
    }
    }
