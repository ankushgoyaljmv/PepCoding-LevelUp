/*********************QUICK SORT*****************/

public static void quickSort(int[] arr, int lo, int hi) {
        //write your code here
        if (lo <= hi) {
            int pivot = arr[hi];
            int pivotIdx = partition(arr, pivot, lo, hi);
            quickSort(arr, lo, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, hi);
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

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }