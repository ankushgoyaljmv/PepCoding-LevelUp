
/********************MERGE SORT/*****************************/

public static int[] mergeSort(int[] arr, int lo, int hi) {
    //write your code here
    if( lo == hi){
        int b[] = new int[1];
        b[0] = arr[lo];
        return b;
    }
     int mid = lo + (hi - lo) / 2;
     
     int lArr[] = mergeSort( arr , lo , mid);
     int rArr[] = mergeSort( arr , mid+1, hi);
     
     int ans[] = mergeTwoSortedArrays(lArr , rArr);
     return ans;
  }

//used for merging two sorted arrays
  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    System.out.println("Merging these two arrays ");
    System.out.print("left array -> ");
    print(a);
    System.out.print("right array -> ");
    print(b);
    int i = 0, j =0, k = 0;
    int[] ans = new int[a.length + b.length];
    while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
          ans[k++] = a[i++];
        }else{
          ans[k++] = b[j++];
        }
    }

    while(i < a.length){
      ans[k++] = a[i++];
    }

    while(j < b.length){
      ans[k++] = b[j++];
    }
    
    return ans;
  }