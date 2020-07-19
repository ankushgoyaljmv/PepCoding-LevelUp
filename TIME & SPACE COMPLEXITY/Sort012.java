//*****************SORT 012 ************************


public static void sort012(int[] arr) {
        int cur = 0;
        int start = 0;
        int end = arr.length - 1;

        while (cur <= end) {

            if (arr[cur] == 0) {
                //swap from start
                swap(arr, cur, start);
                cur++;
                start++;
            } else if (arr[cur] == 1) {
                // no swapping : let it be
                cur++;
            } else if (arr[cur] == 2) {
                swap(arr, cur, end);
                end--;
                //we are not incrementing cur becoz the new element is unknown;
            }
        }
    }