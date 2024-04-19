package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 84; //Phy
        marks[1] = 85 ;//bio
        marks[2] = 86 ;//chem

        //We can also right like this 
        // int marks[]={84,85,86};
        
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
            
        }

    }   
}
