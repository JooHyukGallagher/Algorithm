class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int i=0; i<nums.length; i++) {
            int idx = Math.abs(nums[i]) -1;
            if(nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0){
                arrayList.add(i+1);
            }
        }
        return arrayList; 
    }
}