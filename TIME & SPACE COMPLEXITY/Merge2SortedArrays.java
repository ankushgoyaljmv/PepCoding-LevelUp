/**************MERGE 2 Sorted Array**********/

public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        //write your code here
        int n1 = a.length;
        int n2 = b.length;
        int res[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            
            res[k++] = ( a[i] < b[j] ) ? a[i++] : b[j++];
        }
        
         // if B is exhausted
        while (i < n1) {
            res[k++] = a[i++];
        }
        
        // if A is exhausted
        while (j < n2) {
            res[k++] = b[j++];
        }

        return res;
    }
}