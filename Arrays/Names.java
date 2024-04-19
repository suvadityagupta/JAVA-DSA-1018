//Take an array of names as input from the user and print them on the screen.
package Arrays;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //put size
       int size = sc.nextInt();
       String names[]= new String[size];
       //input
       for(int i = 0; i<names.length; /*i can right variable size as well */ i++){
        names[i]=sc.next();
       }
       //for output
       for(int i=0; i<names.length; i++){
        System.out.println("names " + (i+1) + "is: "+ names[i]);
       }

    }
}
