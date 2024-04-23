//Write a program to toggle a bit a position = “pos” in a number “n”.

package BitManipulation.Homework;

// import java.util.Scanner;

// public class ToggleBit {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Put the number: ");
//         int n = sc.nextInt();
//         System.out.println("Put the position: ");
//         int pos = sc.nextInt();
//         int bitMask = 1 << pos;
//         int newNumber = bitMask | n;
//         System.out.println(newNumber);
//     }
// }
public class ToggleBit {
    public static void main(String[] args) {
        int n = 10; // Example number
        int pos = 2; // Example position

        // Output original number and its binary representation
        System.out.println("Original number: " + n);
        System.out.println("Binary representation: " + Integer.toBinaryString(n));

        // Toggle the bit at position pos
        int result = toggleBit(n, pos);

        // Output the result and its binary representation
        System.out.println("Number after toggling bit at position " + pos + ": " + result);
        System.out.println("Binary representation: " + Integer.toBinaryString(result));
    }

    public static int toggleBit(int n, int pos) {
        // To toggle a bit at a specific position, we can use the XOR (^) operator.
        // We create a mask with a 1 at the desired position and then XOR it with the original number.
        // This will toggle the bit at the specified position.
        int mask = 1 << pos; // Shift 1 to the left by pos positions
        return n ^ mask;
    }
}
