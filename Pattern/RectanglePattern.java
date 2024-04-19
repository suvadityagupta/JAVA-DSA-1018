/**
 * RectanglePattern
 */
import java.util.Scanner;
public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        //Outer Loop
        for(int i=1; i<=row; i++){
            //Inner Loop
            for(int j = 1; j<=col; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }

    
}                                                                  