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