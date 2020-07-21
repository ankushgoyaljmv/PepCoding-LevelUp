/************************************RADIX SORT*******************/

public static void radixSort(int[] arr) {
        //write your code here

        int max = Integer.MIN_VALUE;
        for (int ele: arr) {
            max = Math.max(ele, max);
        }
        for (int exp = 1, itr = 1; max / exp > 0; exp = exp * 10) {
            countSort(arr, exp, itr++);
        }
    }
public static void countSort(int[] arr, int exp, int itr) {
        //write your code here
        //farr
        int fArr[] = new int[10]; //max value will be 10
        for (int ele: arr) {
            fArr[(ele / exp) % 10]++;
        }

        // prefix sum
        int pArr[] = new int[10];
        pArr[0] = fArr[0];

        for (int i = 1; i < 10; i++) {
            pArr[i] = pArr[i - 1] + fArr[i];
        }
        
        //Answer
        int ans[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {

            int ele = arr[i];
            int pos = pArr[(ele / exp) % 10]--;
            ans[pos - 1] = ele;
        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = ans[i];
        }
        System.out.print("After iteration no. " + itr + " -> ");
        print(arr);
    }
