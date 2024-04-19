// package Functions;
// import java.util.Scanner;


// public class Count {
//    public static void main(String args[]) {
//        int positive = 0, negative = 0, zeros = 0;
//        System.out.println("Press 1 to continue & 0 to stop");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();


//        while(input == 1) {
//            System.out.println("Enter your number : ");
//            int number = sc.nextInt();
//            if(number > 0) {
//                positive++;
//            } else if(number < 0) {
//                negative++;
//            } else {
//                zeros++;
//            }


//            System.out.println("Press 1 to continue & 0 to stop");
//            input = sc.nextInt();
//        }


//        System.out.println("Positives : "+ positive);
//        System.out.println("Negatives : "+ negative);
//        System.out.println("Zeros : "+ zeros);
//    }   
// }

package Functions;

import java.util.Scanner;

public class Count {
    public static void calCount() {
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        System.out.println("Press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input == 1) {
            System.out.println("Enter your number : ");
            int num = sc.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
            
            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        } 
        
        System.out.println("Positives : " + positive);
        System.out.println("Negatives : " + negative);
        System.out.println("Zeros : " + zeros);
    }
    
    public static void main(String[] args) {
        calCount();
    }
}
