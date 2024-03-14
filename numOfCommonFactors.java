class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        if(a%b==0 || b%a==0 ||a==b){
            count++;
        }
        int d=Math.max(a,b);
        for(int i=1;i<=d/2;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        if(a==2*b || b==2*a){
            count--;
        }
        return count;
    }
}
