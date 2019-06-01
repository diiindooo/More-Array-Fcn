//Dindo T. Tenoria
//BSCS-3
//CSC 121.1
//activity for Sorting in CSC121.1
import java.util.Random;

public class tenoriaSort{
  
  public static void main(String[] args) {
    
    int [] arr = new int [1000];
    
    for (int i = 0; i < arr.length; i++){
      arr[i] = (int) (1000 * Math.random());
    }
    for (int i = 0; i < arr.length; i++) {
      //System.out.print(arr[i]+ ",");
    }
    
    System.out.print("The Random Numbers are:\n");
    ArrayPrint.print(arr);
    
    // 1. For Bubble Sort
    long startTime = System.nanoTime(); //starting time of BubbleSort Algo
    
    BubbleSort.bubbleSort(arr);
    long endTime   = System.nanoTime();
    long totalTime = endTime - startTime;
    System.out.println("The BubbleSort Result is:");
    ArrayPrint.print(arr);
    System.out.println("Total Running Time for BubbleSort is:");
    System.out.println(totalTime + " nanoseconds");
   
    
   
    
    // 2. For Selection Sort
    startTime = System.nanoTime(); //starting time of SelectionSort Algo
    
    SelectionSort.selectionSort(arr);
    endTime   = System.nanoTime();
    totalTime = endTime - startTime;
    System.out.println("The SelectionSort Result is:");
    ArrayPrint.print(arr);
    System.out.println("Total Running Time for SelectionSort is:");
    System.out.println(totalTime + " nanoseconds");
    
    // 3. For Insertion Sort
    startTime = System.nanoTime(); //starting time of InsertionSort Algo
    
    InsertionSort.insertionSort(arr);
    endTime   = System.nanoTime();
    totalTime = endTime - startTime;
    System.out.println("The InsertionSort Result is:");
    ArrayPrint.print(arr);
    System.out.println("Total Running Time for InsertionSort is:");
    System.out.println(totalTime + " nanoseconds");
    
    
  }
}
