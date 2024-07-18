class Solution {
    public int titleToNumber(String columnTitle) {
        long sum=0;
        for(int i=0;i<columnTitle.length()-1;i++){
            sum+=((long)(columnTitle.charAt(i))-64)*Math.pow(26,columnTitle.length()-1-i);
        }
        sum+=(long)(columnTitle.charAt(columnTitle.length()-1))-64;
    return (int)sum;
    }
}
