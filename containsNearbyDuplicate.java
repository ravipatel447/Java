class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0)return false;
        Map<Integer,Integer>m=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(m.containsKey(x) && i-m.get(x)<=k){
                return true;
            }
            m.put(x,i);
        }
        return false;
    }
}
