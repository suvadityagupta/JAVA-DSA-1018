import java.util.Scanner;
class ResultCard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        int choice;
        do{
            System.out.println("Menu:");
            System.out.println("You can enter only two choice ");
            System.out.println("1 Enter students mark");
            System.out.println("0 exit the menu");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                System.out.println("Enter student's number out of 100: ");
                marks = sc.nextInt();
                if(marks >=90){
                    System.out.println("This is Good");
                }else if(marks >= 60){
                    System.out.println("This is also Good");
                }
                else if(marks >=0){
                    System.out.println("This is Good as well");
                }
                else{
                    System.out.println("Invalid marks entered");
                }
                break;
                case 0 :
                System.out.println("Exiting____");
                break;
                default:
                System.out.println("Invalid choice, please enter again.");
        }
    }while (choice != 0);
    }
}

//SHORT FORM
//import java.util.*;


// public class ResultCard {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int input;
 
 
//         do {
//             int marks = sc.nextInt();
//             if(marks >= 90 && marks <= 100) {
//                 System.out.println("This is Good");
//             } else if(marks >= 60 && marks <= 89) {
//                 System.out.println("This is also Good");
//             } else if(marks >= 0 && marks <= 59) {
//                 System.out.println("This is Good as well");
//             } else {
//                 System.out.println("Invalid");
//             }
 
 
//             System.out.println("Want to continue ? (yes(1) or no(0))");
//             input = sc.nextInt();
       
//         } while(input == 1);
//     }   
//  }
 
 
 