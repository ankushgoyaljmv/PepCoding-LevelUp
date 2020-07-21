import java.io.*;
import java.util.*;

public class Main {
    
    public static int pivotFind( int arr[]){
        
        int pidx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                pidx = i;
                break;
            }
        }
        return pidx;
    }

    public static void targetSumPair(int[] arr, int target) {
        //write your code here
        //finding pivot

        int pidx = pivotFind( arr );
        int i = pidx;
        int j = (pidx - 1) >= 0 ? pidx - 1 : arr.length - 1;
        int count = 0;
        while (count < arr.length - 1) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println(arr[i] + ", " + arr[j]);
                i = (i + 1) % arr.length;
                j = (j - 1 + arr.length) % arr.length;
                count += 2;

            } else if (sum > target) {
                j = (j - 1 + arr.length) % arr.length;
                count += 1;
            } else {
                i = (i + 1) % arr.length;
                count += 1;
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPair(arr, target);
    }

}