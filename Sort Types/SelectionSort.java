public class SelectionSort{
  
  public static void selectionSort(int[] arr){
    
    int i;
    for(i = 0; i < arr.length-1; i++){
      int min = i;
      for(int j = i+1; j<arr.length; j++){
        if(arr[j] < arr[min]){
          min = j;
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        
        
      }
      
    }
    
  }
  
  
}