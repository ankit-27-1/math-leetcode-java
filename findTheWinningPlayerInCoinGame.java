class Solution {
    public String losingPlayer(int x, int y) {
        int n=0;
        while(x>0 && y>3){
            x--;
            y=y-4;
            n++;
        }
        String s="Alice";
        String t="Bob";
        if(n%2==0){
            return t;
        }
        else{
            return s;
        }
    }
}
