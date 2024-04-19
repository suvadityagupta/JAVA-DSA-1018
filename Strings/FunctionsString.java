package Strings;

public class FunctionsString {
    public static void main(String[] args) {
        
          //concatenation
    String firstName = "tony";
    String secondName = "stark";
    String fullName= firstName + " " + secondName ;
    System.out.println(fullName);
    System.out.println(fullName.length()); //to check length 

    //charAt to print the string in different lines
    for(int i = 0; i <fullName.length(); i++){
        System.out.println(fullName.charAt(i));
    }

    //compare two strings
    String name1 = "Tony";
    String name2 = "Tony";

    //1. s1>s2 : +ve value
    //2. s1=s2 : 0 
    //3. s1>s2 : -ve value

    if (name1.compareTo(name2)==0) {
        System.out.println("Both are equal");
    }else{
        System.out.println("Both are not equal");
    }

    //substring
    String sentence = "My name is stark";
    //substring(beg index, end index) to print characters from the given index
    String name = sentence.substring(11, sentence.length());
    //it prints 
    System.out.println(name);

    String sen1 = "TonyStark";
    String sen2 = sen1.substring(0, 4);
    // it prints characters between 0th and 4th index. 
    //Start from 0th index and will print till 3rd index 
    //that means it will print 1st 4 characters
    System.out.println(sen2);

    //Strings are immutable

    
    } 

    
   
    

    
   

  
    
}
