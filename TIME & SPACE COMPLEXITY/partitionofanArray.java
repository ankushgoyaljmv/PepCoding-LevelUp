
/************************** PARTITION AN ARRAY/***********************

public static void partition(int[] arr, int pivot) {
        //write your code here
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] > pivot) {
                i++;
            }
        }
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }