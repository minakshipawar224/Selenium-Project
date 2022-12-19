package Demo1;

public class Array_sorting_without_sortAlgo {
    public static void main(String[] args) {        
        
        //Initialize array     
        int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.println(arr[i] + " ");    
        }    
        System.out.println("Second highest element");
        System.out.println(arr[arr.length-2]);
        System.out.println("Second lowest element");
        System.out.println(arr[arr.length-4]);
    }    
}   

