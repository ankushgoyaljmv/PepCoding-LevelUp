/*********** Targer SUm Pair1*************


public static void targetSumPair(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (arr[start] + arr[end] == target) {
                System.out.println(arr[start] + ", " + arr[end]);
                start++;
                end--;
            } else if (arr[start] + arr[end] < target) {
                start++;
            } else if (arr[start] + arr[end] > target) {
                end--;
            }
    }



}