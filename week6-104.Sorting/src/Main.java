
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
       int[] values = {3, 2, 5, 4, 8};

        System.out.println( Arrays.toString(values) );

        swap(values, 1, 0);
        System.out.println( Arrays.toString(values) );

        swap(values, 0, 3);
        System.out.println( Arrays.toString(values) );
    }
    
    public static int smallest(int[] array) {
    // write the code here
    int helper = array[0];
    for (int i = 0; i < array.length; i++) {
          if (helper >= array[i]) {
              helper = array[i];
          }
    }
    return helper;
}
    
    public static int indexOfTheSmallest(int[] array) {
    int helper = smallest(array);
    for (int i = 0; i < array.length; i++) {
        if (helper == array[i]) {
            return i;
        }
    }
    return -1;
}
    
   public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    int smallest = array[index];
    int smallestIndex = index;
    for (int i = index; i < array.length; i++){
        if (smallest > array[i]){
            smallest = array[i];
            smallestIndex = i;
        }
    }
    return smallestIndex;   
}
   
   public static void swap(int[] array, int index1, int index2) {
        int placeholder = array[index1];
        array[index1] = array[index2];
        array[index2] = placeholder;
    }
   public static void sort(int[] array) {
        
        System.out.println( Arrays.toString(array) );
        
        for (int i=0; i<array.length; i++){
            swap(array,indexOfTheSmallestStartingFrom(array, i), i);
            System.out.println( Arrays.toString(array) );
        }
}
}
