package Functions;

import java.util.Scanner;

public class Circumference {
    public static Double calCircumference(Double radius) {
        System.out.println("Circumference of the circle will be: ");
        return 2 * 3.14 * radius;
    }
    public static void main(String[] args) {
        System.out.println("Put the radius: ");
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        
        System.out.println(calCircumference(radius));
    }
    
}

