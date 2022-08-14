package majorelement;

/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than [n / 2] times.
You may assume that the majority element always exists in the array.*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]) + 1;
                map.put(nums[i], value);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
