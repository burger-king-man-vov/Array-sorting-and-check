class AscendingOrderSort {


    static void PrintArray(int array[]){
      for (int i=0;i<array.length;i++){
       System.out.print(array[i] + " ");
      }
       System.out.println("<<< SORTED ARRAY");
    }
    
    static void CheckIfSorted(int arr[],int alreadysortedarray[]){
      int temparr[] = alreadysortedarray;
      int givenarray[] = arr;


    for (int i=0;i<givenarray.length;i++){
      for(int j=i+1;j<givenarray.length;j++){
        if(givenarray[i]>givenarray[j]){
          int tempvar = givenarray[i];
          givenarray[i] = givenarray[j];
          givenarray[j] = tempvar;
        }
      }
    } //// after this givenarray is sorted. 
     if(temparr != givenarray){
       throw new ArithmeticException("Arrays are not the same");
     }
     else{
       System.out.println("Arrays are the same");
       System.out.println("Already sorted array:");
       PrintArray(temparr);
       System.out.println("Given unsorted array:");
       PrintArray(givenarray);
     }
    }

    static int[] SortArray(int array[]){
      int temp = 0;

     for(int i=0;i<array.length;i++)
      for(int j=i+1;j<array.length;j++){
       {
        if (array[i]>array[j]){
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
   }

   public static void main(String args[]){
     int array[] = {
       1789, 2035, 1899, 1456 
       };

      int sortedarray[] = SortArray(array);
      
      CheckIfSorted(array, sortedarray);
   }
}
