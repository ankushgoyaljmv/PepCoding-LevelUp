public static void sortDates(int[] arr) {
        //write your code here
        for (int itr = 1; itr <= 3; itr++) {
            countSort(arr, itr);
        }
    }
public static void countSort(int[] arr, int itr) {
        //1 ==> day
        //2 ==> month
        //3 ==> year

        int fArr[];
        if (itr == 1) {
            // max days : 31
            fArr = new int[32];
        } else if (itr == 2) {
            //max months : 12
            fArr = new int[13];
        } else {

            fArr = new int[10000];
        }
for (int date: arr) {
            if (itr == 1) {
                //date
                fArr[(date / 1000000)]++;

            } else if (itr == 2) {

                //month
                fArr[(date / 10000) % 100]++;
            } else if (itr == 3) {

                //year
                fArr[(date % 10000)]++;
            }
        }

        // prefix sum array
        for (int i = 1; i < fArr.length; i++) {
            fArr[i] += fArr[i - 1];
        }
//Answer built
        int ans[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int date = arr[i];

            int pos = 0;
            if (itr == 1) {
                pos = fArr[(date / 1000000)]--;
            } else if (itr == 2) {
                pos = fArr[(date / 10000) % 100]--;
            } else if (itr == 3) {
                pos = fArr[(date % 10000)]--;
            }

            ans[pos - 1] = date;
        }

        //copy
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
}