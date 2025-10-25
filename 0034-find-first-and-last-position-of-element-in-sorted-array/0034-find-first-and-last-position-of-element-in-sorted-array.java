class Solution {
    public int[] searchRange(int[] nums, int target) {
        return firstAndLastOccurence(nums,target);
    }
    public int [] firstAndLastOccurence(int [] arr, int x){
        int first = -1;
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == x){
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] > x) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        int last = -1;
        low = 0;
        high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == x){
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] > x) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return new int [] {first,last};
    }
}