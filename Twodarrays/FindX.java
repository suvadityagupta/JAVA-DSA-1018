package Twodarrays;
import java.util.*;


public class FindX {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();


       int[][] numbers = new int[rows][cols];


       //input
       //rows
       System.out.println("Enter the elements of the array (one by one):");
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }
       System.out.println("Enter the x of the array to search: ");
       int x = sc.nextInt();
       //output
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
                 if (numbers[i][j]==x) {
                    System.out.println("x found at location: ("+i +","+ j + ")");
                
                
                 }
               }
               System.out.println();
           }
   }
}
