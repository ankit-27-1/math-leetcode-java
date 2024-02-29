class Solution {
    public int alternateDigitSum(int n) {
        int p=0;
        int a=n;
        while(a>0){
            a=a/10;
            p++;
        }
        if(p%2==0){
            p=-1;
        }
        else{
            p=1;
        }
        int sum=0;
        while(n>0){
            sum=(sum)+(n-(n/10)*10)*p;
            n=n/10;
            p=p*(-1);
        }
        return sum;
    }
}
