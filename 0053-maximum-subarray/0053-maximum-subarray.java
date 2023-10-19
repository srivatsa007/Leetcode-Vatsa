class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum= -10000; 
        int currentsum=0;
        int x=0; int y=0;
        int temp=0;
        int n= nums.length;

        for(int i=0; i<n; i++){
            currentsum = currentsum + nums[i];
            if(currentsum>maxsum){
                maxsum=currentsum;
                x=temp;
                y=i;
            }
            if(currentsum<0){
                currentsum= 0;
                temp = i+1;
            }
        }
        return maxsum;
    }
}