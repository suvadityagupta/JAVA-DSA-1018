package BitManipulation.Homework;

// import java.util.Scanner;

// public class PowerOfTwo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//                 boolean isPowerOfTwo = (number & (number - 1)) == 0;
//                 System.out.println(number + " is power of 2: " + isPowerOfTwo);
//     }
// }
public class PowerOfTwo {
    public static void main(String[] args) {
        int number = 16; // You can change this to test different numbers
        
        if(isPowerOfTwo(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }

    public static boolean isPowerOfTwo(int num) {
        // A number is a power of 2 if and only if it has only one bit set in its binary representation.
        // We can use the bitwise AND operation to check if num & (num - 1) equals 0.
        // If it equals 0, then the number is a power of 2.
        // Note: This approach will return true for num = 0. If you want to consider 0 as not a power of 2, you can add num != 0 condition.

        return (num > 0) && ((num & (num - 1)) == 0);
    }
}
