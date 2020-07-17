/*
Question
1. You are given an array(arr) of integers.
2. You have to find the k-th smallest element in the given array using the quick-select algorithm.

Input Format:
An Integer n 
arr1
arr2..
n integers
An integer k

Output Format:

Constraints:
1 <= N <= 100000
-10^9 <= arr[i] <= 10^9
1 <= k <= N

Sample Input:
5
7 
-2 
4 
1 
3
3

Sample Output:
pivot -> 3
Swapping -2 and 7
Swapping 1 and 7
Swapping 3 and 4
pivot index -> 2
3
*/


public static int quickSelect(int[] arr, int lo, int hi, int k) {
    //write your code here
    int pivot = arr[hi];
    int pIdx = partition( arr ,pivot , lo , hi);
    
    if( k == pIdx){
        return arr[pIdx];
    }
    
    else if(k  > pIdx){
        //kth smallest element always lie of right side
        return quickSelect(arr , pIdx + 1 ,hi , k );
    }
    else{
        // kth smallest element always lie on left side
        
        return quickSelect( arr , lo , pIdx -1 , k); 
    }
    
  }

public static int partition(int[] arr, int pivot, int lo, int hi) {
    System.out.println("pivot -> " + pivot);
    int i = lo, j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    System.out.println("pivot index -> " + (j - 1));
    return (j - 1);
  }