public static void sort01(int[] arr){
    //write your code here
    int j = 0 ;
    for( int i = 0 ; i < arr.length ; i++){
        
        if( arr[i] == 1){
            continue;
        }
        
        else{
            swap( arr , i , j);
            j++;
        }
    }
    
  }