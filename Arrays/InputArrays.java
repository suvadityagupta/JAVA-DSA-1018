package Arrays;

import java.util.Scanner;

public class InputArrays {
    public static void main(String[] args) {
        
        System.out.println("Put the length of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];//it will print 0 by default because it is an array. It will store null value in the space of array.

        // to take multiple inputs or to create an array with value we use loop
        System.out.println("Enter the values of the arrays: ");
        for (int i = 0; i < size; i++) {
            
            numbers[i]=sc.nextInt();            
        }System.out.println("The Array will be: ");
        for (int i = 0; i < size; i++) {
            
            System.out.println(numbers[i]);
            
        }

    }   
}
