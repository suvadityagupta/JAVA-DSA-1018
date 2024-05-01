//Leap year or not
package PrepInstaQstns;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2003;
        if ((year % 4 == 0 && year%100!=0) || (year % 400 == 0 )) {
            System.out.println("Its a leap year");
        }else{
            System.out.println("its not a leap year");
        }
        }        
}
