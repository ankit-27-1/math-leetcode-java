class Solution {
    public int differenceOfSum(int[] nums) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            x=x+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                y=y+nums[i];
            }
            else{
                y=y+digitSum(nums[i]);
            }
        }
        return Math.abs(x-y);
    }
    public int digitSum(int n){
        int y=0;
        while(n>0){
            y=(y)+(n%10);
            n=n/10;
        }
        return y;
    }
}
