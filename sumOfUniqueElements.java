//https://leetcode.com/problems/sum-of-unique-elements/

class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length; i++){
      int count = 0;
      for(int j = i + 1; j < nums.length && nums[i]!=101;j++){
        if(nums[i]==nums[j]){
          count = 1;
          nums[j] = 101;
        }
      }
      if(count == 0 && nums[i]!=101){
        sum+=nums[i];
      }
    }
    return sum;
    }
}
