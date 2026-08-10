# Largest Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a list of non-negative integers `nums`, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

 **Example 1:** 

```
Input: nums = [10,2]
Output: "210"

```

 **Example 2:** 

```
Input: nums = [3,30,34,5,9]
Output: "9534330"

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 94.64%)  
**Memory:** 45 MB (beats 61.31%)  
**Submitted:** 2026-08-10T06:20:30.361Z  

```java
import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert integer array to String array for easy concatenation comparison
        String[] sNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sNums[i] = String.valueOf(nums[i]);
        }
        
        // Sort strings using a custom comparator based on concatenated values
        Arrays.sort(sNums, (a, b) -> (b + a).compareTo(a + b));
        
        // Edge case: if the largest number is "0", the result is simply "0"
        if (sNums[0].equals("0")) {
            return "0";
        }
        
        // Append all sorted strings together
        StringBuilder sb = new StringBuilder();
        for (String num : sNums) {
            sb.append(num);
        }
        
        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-number/)