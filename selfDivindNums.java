class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int n=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean isSelfDividing(int num){
        int n=num;
        while(n>0){
            int digit=n%10;
            if(digit==0 || num%digit!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
}
