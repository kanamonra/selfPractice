// Leetcode practice Array
public class challengeDay1 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0; // Pointer for unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
    public static void main(String[] args){
        challengeDay1 solution = new challengeDay1();
        int[] nums1 = {1, 1, 2};
        int result1 = solution.removeDuplicates(nums1);
        System.out.println("Output: " + result1);
        System.out.print("nums1 = [");
        for (int i = 0; i < result1; i++) {
            System.out.print(nums1[i] + (i < result1 - 1 ? ", " : ""));
        }
        System.out.println("]");

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result2 = solution.removeDuplicates(nums2);
        System.out.println("Output: " + result2);
        System.out.print("nums2 = [");
        for (int i = 0; i < result2; i++) {
            System.out.print(nums2[i] + (i < result2 - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
