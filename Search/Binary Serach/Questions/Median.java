public class Median {
    public static void main(String[] args) {
        
    }

    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        int n = n1 + n2;
        int ind2 = n / 2;
        int ind1 = ind2 - 1;
        int cnt = 0;
        int ind1Ele = -1;
        int ind2Ele = -1;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (cnt == ind1) ind1Ele = arr1[i];
                if (cnt == ind2) ind2Ele = arr1[i];
                cnt++;
                i++;
            } else {
                if (cnt == ind1) ind1Ele = arr2[j];
                if (cnt == ind2) ind2Ele = arr2[j];
                cnt++;
                j++;
            }
        }

        while (i < n1) {
            if (cnt == ind1) ind1Ele = arr1[i];
            if (cnt == ind2) ind2Ele = arr1[i];
            cnt++;
            i++;
        }

        while (j < n2) {
            if (cnt == ind1) ind1Ele = arr2[j];
            if (cnt == ind2) ind2Ele = arr2[j];
            cnt++;
            j++;
        }

        if (n % 2 == 1) {
            return (double) ind2Ele;
        } else {
            return (double) (ind1Ele + ind2Ele) / 2.0;
        }
    }

    // public static int findMedianOfSortedArrays(int[] arr1, int[] arr2){
    //     int n1 = arr1.length;
    //     int n2 = arr2.length;
    //     int n = n1+n2;

    //     if(n1 > n2) return findMedianOfSortedArrays(arr2, arr1);

    //     int low = 0;
    //     int high = n1;
    //     int left = (n1+n2+1)/2;

    //     while(low<=high){
    //         int mid1 = (low+high)/2;
    //         int mid2 = left - mid1;

    //         int l1  = Integer.MIN_VALUE;
    //         int l2 = Integer.MIN_VALUE;

    //         int r1 = Integer.MAX_VALUE;
    //         int r2 = Integer.MAX_VALUE;

    //         if(mid1 < n1) r1 = arr1[mid1];
    //         if(mid2 < n2) r2 = arr2[mid2];

    //         if(mid1 - 1 >= 0) l1 = arr1[mid1 - 1];
    //         if(mid2 - 1 >= 0) l2 = arr2[mid2 - 1];

    //         if(l1 <= r2 && l2 <= r1){
    //             if(n%2 == 1) return Math.max(l1,l2);
    //             return (Math.max(l1, l2) + Math.min(r1, r2))/2;
    //         }
    //     }
    //     return -1;
    // }

}
