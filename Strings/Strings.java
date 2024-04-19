package Strings;

import java.util.Scanner;

class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //we use nextLine to take input for the whole line. 
        //if I put Tony STark it will print Tony Stark but in the 
        // case sc.next(); it will only show "Tony" it will ignore the words onwards
        System.out.println(name + " is the string");
    }
    
}
