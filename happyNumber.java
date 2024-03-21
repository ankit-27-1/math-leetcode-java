class Solution {
    public boolean isHappy(int n) {
        int a=0;
        int num=n;
        int p=0;
        int temp=0;
        while(a!=20){
            if(temp==1){
                return true;
            }
            if(temp!=0){
                num=temp;
            }
            temp=0;
            p=0;
            while(num>0){
                p=num-((num/10)*10);
                temp=temp+(p*p);
                num=num/10;
            }
            a++;
        } 
       return false;
    }
}
