package BitManipulation;

import java.util.Scanner;

public class BitGet {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Eneter the number :");
        // int n = sc.nextInt();
        int n = 5; //0101
      int pos = 2;
      int bitMask = 1<<pos;
      if ((bitMask & n)==0) {
        System.out.println("bit was zero");        
      }else{
        System.out.println("bit was one");
      } 
    }    
}
