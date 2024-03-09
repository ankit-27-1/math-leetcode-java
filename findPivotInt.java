class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int s=(n*(n+1)/2);
        for(int i=n;i>0;i--){
            int s1=s-((i-1)*(i)/2);
            int s2=(i*(i+1)/2);
            if(s1==s2){
                return i;
            }
        }
        return -1;
    }
}
