class Solution {
    public int countDigits(int num) {
        int count=0;
        int a=num;
        while(num>0){
            int p=num-((num/10)*10);
            num=num/10;
            if(a%p==0){
                count++;
            }
        }
        return count;
    }
}
