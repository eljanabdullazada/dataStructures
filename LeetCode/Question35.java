package LeetCode;

public class Question35 {

    public static void main(String[] args){
        int [] nums = {1, 2, 3, 4, 6, 7, 8, 9};
        int target = 5;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        if(target <= nums[0]) return 0;
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                return i;
            }
            if((target < nums[i]) && (target > nums[i - 1])){
                return i;
            }
            else {
                index = i + 1;
            }
        }

        return index;
    }
}
