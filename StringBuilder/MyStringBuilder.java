package StringBuilder;
import java.util.*;
public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        //Insert at index
        sb.insert(2, 'S');
        System.out.println(sb);
        //delete the extra 's'
        sb.delete(2,3);
        System.out.println(sb);
        //append = to add something at the end
        StringBuilder tb = new StringBuilder("h");
        tb.append("a"); //in string it will be str = str + "a"
        tb.append("r");
        tb.append("i");
        tb.append("o");
        tb.append("m");
        System.out.println(tb);
        //length
        System.out.println(tb.length());


    }
}
