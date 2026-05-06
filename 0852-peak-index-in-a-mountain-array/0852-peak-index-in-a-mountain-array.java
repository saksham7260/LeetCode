class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 2;
        int StoreIndex = -1;
        while(left <= right) {
            int Mid = left + (right - left) / 2;
            if(arr[Mid] > arr[Mid + 1]) {
              StoreIndex = Mid;
                right = Mid - 1;
            }else {
                left = Mid + 1;
            }
        }
        return StoreIndex;
    }
}