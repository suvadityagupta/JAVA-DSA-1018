package BitManipulation;

import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Eneter the number :");
        // int n = sc.nextInt();
        int n = 5 ; //0101
      int pos = 2;
      int bitMask = 1<<pos;
      int notBitMask = ~(bitMask);
      int newNumber = notBitMask & n;
      System.out.println(newNumber);
    }    
}
