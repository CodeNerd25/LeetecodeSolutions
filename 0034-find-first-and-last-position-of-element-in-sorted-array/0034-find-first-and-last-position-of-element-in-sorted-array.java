class Solution {
    public int[] searchRange(int[] nums, int target){
        return FirstAndLastOccurence(nums , target);
    }
    public static int [] FirstAndLastOccurence(int [] arr , int target){
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(target == arr[mid]){
                first = mid;
                high = mid - 1;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        int last = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(target == arr[mid]){
                last = mid;
                low = mid + 1;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return new int[]{first,last};
    }
}