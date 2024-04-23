package Sorting;
/**
 * BubbleSort
 */
public class BubbleSort {
    public static void printArray(int arr[]) {
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();       
    }
    public static void main(String[] args) {
        int arr[] = {3,5,7,1,6};
        //arr.length = n
        //so the outer loop will count n-1 iteration
        //here arr.length represents n
        for(int i = 0; i<arr.length-1; i++){
            //why here i is present 
            
            
            for(int j = 0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    //we will swap the numbers
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }         
            }         
        }
        printArray(arr);        
    }
}
// public class BubbleSort {
//     public static void printArray(int arr[]) {
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {7,8,1,3,2}; 
//         //Time complexity = 0(n^2)
//         //bubble sort
//         for(int i = 0; i<arr.length-1; i++){
//             for(int j = 0; j<arr.length-i-1; j++){
//                 //number of elements we want to move is equal to i
//                 if (arr[j]>arr[j+1]) {
//                     //swap
//                     int temp = arr[j]; //storing the value of in temp var
//                     arr[j] = arr[j+1]; //swapping
//                     arr[j+1] = temp;    //storing the value of temp in arr[i+1]                  
                    
//                 }
//             }
            
//         }
//         printArray(arr);        
//     }
// }


/**
 * BubbleSort
 */
// public class BubbleSort {
//     public static void printArray(int arr[]) {
//         for(int i = 0; i< arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();     
       
//     }

//     public static void main(String[] args) {
//         int arr[] = {5,9,4,1,2};
//         //outer loop
//         for(int i = 0; i< arr.length-1; i++){
//             for(int j = 0; j< arr.length-i-1; j++){
//                 if (arr[j]>arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
            
//         }
//         printArray(arr);   
//     }
// }