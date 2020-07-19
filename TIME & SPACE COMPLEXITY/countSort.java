/*************************Count Sort***************
 
public static void countSort(int[] arr, int min, int max) {

        int freqArr[] = new int[max - min + 1];
        
        for (int val: arr) {
            int relativeIdx = val - min;
            freqArr[relativeIdx]++;
        }

        // prefix sum
        // no need to create new array, store prefix sum in the the freqArray itself
        for (int i = 1; i < freqArr.length; i++) {
            freqArr[i] = freqArr[i] + freqArr[i - 1];
        }

        int res[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int pos = freqArr[val - min];
            res[pos - 1] = val;
            freqArr[val - min]--;// slots reduced
            
        }

for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }

    }