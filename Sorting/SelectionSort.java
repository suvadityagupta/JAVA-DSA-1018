package Sorting;
// class Sorting {
//    public static void printArray(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String args[]) {
//        int arr[] = {7, 8, 1, 3, 2};

//         //time complexity = 0(n^2)
//        //selection sort 
//        // to store the smallest index in the array
//        for(int i=0; i<arr.length-1; i++) {
//            int smallest = i;
//             //loop will start from the previous element from the smallest element we had pick (i)
//             //from the array and will compare with the rest of the elements
//            for(int j=i+1; j<arr.length; j++) {
//                if(arr[j] < arr[smallest]) {
//                    smallest = j;
//                }
//            }
//            //swap
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }
//        printArray(arr);
//    }
// }
/**
 * SelectionSort
 */
public class SelectionSort {
    public static void printArray(int arr[]) {
               for(int i=0; i<arr.length; i++) {
                   System.out.print(arr[i]+" ");
               }
               System.out.println();
           }

    public static void main(String[] args) {
        int arr[] = {5,9,4,2,3};
        //outer loop
        //it will run n-1 time
        for(int i = 0; i< arr.length-1; i++){
            //to store the smallest index in the array
            int smallest = i;
            //inner loop will start from next element of i
            //that means i + 1
            for(int j = i+1; j<arr.length; j++){
                 if (arr[smallest]>arr[j]) {
                    smallest = j;
                 }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i] = temp;          
        }
        printArray(arr);
    }    
}
 
