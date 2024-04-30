package Recursion;
//print numbers 1 to 5
public class PrintNumb {
    public static void printNumb(int n) {
        //base
        if(n==6){
            return;
        }        
        System.out.println(n);
        printNumb(n+1);
        
    }
    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }
}
