class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        
        int longest =0;

        for(int i=0;i<nums.length;i++){

            if(!hs.contains(nums[i] -1)){
               int current = nums[i];
               int length = 1;

               while(hs.contains(current + 1)){
                  current++;
                  length++;
               }

               longest = Math.max(longest,length);
            }     
        }

        return longest;

        
    }
}
