class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
               int sum=nums[i]+nums[low]+nums[high];
                if(sum==target){
                    return sum;
                }
                if(Math.abs(target-sum)<Math.abs(target-res)){
                    res=sum;
                }
                if(sum>target){
                    high--;
                }else{
                    low++;
                }
            }
        }return res;
    }
}
