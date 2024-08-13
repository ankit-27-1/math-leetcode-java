class Solution {
    public int numberOfChild(int n, int k) {
        int p=0;
        boolean ans=true;
        while(k>0){
            if(ans==true){
                k--;
                p++;
            }
            else{
                k--;
                p--;
            }
            if(p==n-1){
                ans=false;
            }
            if(p==0){
                ans=true;
            }
        }
        return p;
    }
}
