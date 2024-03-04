class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume =(long)length*width*height;
        boolean bulky = (length >= 10000 || width >= 10000 || height >= 10000) || volume>= 1000000000;
        boolean heavy = mass >= 100;
        
        if (bulky && heavy) {
            return "Both";
        } else if (!bulky && !heavy) {
            return "Neither";
        } else if (bulky && !heavy) {
            return "Bulky";
        } else if(!bulky && heavy){
            return "Heavy";
        }
        return "Null";
    }
}
