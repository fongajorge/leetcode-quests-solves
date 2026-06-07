class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] solution = new int[nums.length];

        int lengthHalf = nums.length/2;

        for (int i = 0; i < lengthHalf; i++) {
            int j = i*2;
            solution[j] = nums[i];
            solution[j+1] = nums[i+(lengthHalf)];
        }

        return solution;
    }
}
