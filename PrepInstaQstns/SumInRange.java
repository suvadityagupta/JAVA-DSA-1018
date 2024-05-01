//Sum of numbers in a given range
package PrepInstaQstns;

public class SumInRange {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = 0;
        for(int i = a; i<=b; i++){
            sum += i;
        }
        System.out.println(sum);        
    }
}
