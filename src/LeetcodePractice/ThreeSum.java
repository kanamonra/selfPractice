package LeetcodePractice;
import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the given array nums
        Arrays.sort(nums);
        // Initialize an empty list to store the result.
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        // Iterate through the array with a fixed pointer i from index 0 to length - 2.
        for (int i = 0; i < length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                if (total == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (total < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 1, 1};
        int[] nums3 = {0, 0, 0};
        System.out.println(solution.threeSum(nums1));  // Output: [[-1, -1, 2], [-1, 0, 1]]
        System.out.println(solution.threeSum(nums2));  // Output: []
        System.out.println(solution.threeSum(nums3));  // Output: [[0, 0, 0]]
    }
}