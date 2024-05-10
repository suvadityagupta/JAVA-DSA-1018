package PrepInstaQstns;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12021; 
        int rev = 0;
        int rem;
        int temp;
        temp = num;
        while (temp!=0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /=10;            
        }
        if (num==rev) {
            System.out.println("Its a Palindrome number");            
        } else{
            System.out.println("Not a paindrome number");
        }
    }
}
