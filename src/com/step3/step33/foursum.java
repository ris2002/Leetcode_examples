package com.step3.step33;

public class foursum
        public static List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList<>();
            int n = nums.length;

            Arrays.sort(nums); // Sort the array to handle duplicates and for optimized solution

            for (int i = 0; i < n - 3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) // Skip duplicates
                    continue;

                for (int j = i + 1; j < n - 2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) // Skip duplicates
                        continue;

                    int left = j + 1;
                    int right = n - 1;

                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];

                        if (sum == target) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                            // Skip duplicates for left pointer
                            while (left < right && nums[left] == nums[left + 1])
                                left++;

                            // Skip duplicates for right pointer
                            while (left < right && nums[right] == nums[right - 1])
                                right--;

                            left++;
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums = {1, 0, -1, 0, -2, 2};
            int target = 0;
            List<List<Integer>> result = fourSum(nums, target);
            System.out.println(result);
        }
