/**************************SELECTION SORT************/

public static void selectionSort(int[] arr) {
    for( int i = 0 ; i < arr.length - 1 ; i++){
        int minIdx = i ; 
        for( int j = i + 1 ; j < arr.length  ; j++  ){
            if(isSmaller( arr , j , minIdx )){
                minIdx = j;
            }
        }
        swap( arr , i , minIdx );
    }
    
  }
// used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // return true if ith element is smaller than jth element
  public static boolean isSmaller(int[] arr, int i, int j) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }