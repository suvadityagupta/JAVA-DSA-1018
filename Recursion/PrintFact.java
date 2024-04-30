package Recursion;

public class PrintFact {
    public static int calcFact(int n) {
        if (n==1 || n==0) {
            return 1;            
        }
        int fact_nm1 = calcFact(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n = 6;
        calcFact(n);
        System.out.println(calcFact(n));        
    }
}
