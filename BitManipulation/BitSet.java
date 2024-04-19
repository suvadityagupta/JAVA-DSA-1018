package BitManipulation;

import java.util.Scanner;

public class BitSet {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Eneter the number :");
        // int n = sc.nextInt();
        int n = 5 ; //0101
      int pos = 1;
      int bitMask = 1<<pos;
      int newNumber = bitMask | n;
      System.out.println(newNumber);
    }    
}
