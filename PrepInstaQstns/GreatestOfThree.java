//Greatest of the Three numbers
package PrepInstaQstns;

public class GreatestOfThree {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        int c = 15;
        if (a>b && a>c ) {
            System.out.println("a is greater of three");            
        }else if(b>c && b>a){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is the greatest");
        }
    }
}
