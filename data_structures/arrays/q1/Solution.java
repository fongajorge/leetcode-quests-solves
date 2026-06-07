class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] solution =  new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++) {
            int j = i + nums.length;

            solution[i] = nums[i];
            solution[j] = nums[i];
        }
        
        return solution;
    }
}