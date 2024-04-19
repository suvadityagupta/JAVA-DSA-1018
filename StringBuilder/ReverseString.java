package StringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        for(int i = 0; i<sb.length() -1 -i; i++){
            int front = i;
            int back = sb.length() -1-i; //5 -1 -0 = > 4
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            //now to replace
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
    
}
