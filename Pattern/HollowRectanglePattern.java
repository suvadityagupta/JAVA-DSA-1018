
import java.util.Scanner;
public class HollowRectanglePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        //Outer Loop
        for(int i=1; i<=row; i++){
            //Inner Loop
            for(int j = 1; j<=col; j++){
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}