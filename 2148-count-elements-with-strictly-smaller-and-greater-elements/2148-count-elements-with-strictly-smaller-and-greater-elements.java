class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        int n = nums.length;
        int max = maximum(nums);
        int min = minimum(nums);
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == max || nums[i] == min){
                count++;
            }
        }
    return n - count;
    }
    public static int maximum(int [] arr) {
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minimum(int [] arr) {
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}