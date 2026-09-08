class Solution {
    public int countCommas(int n) {
        //logic he (simple math)
        String h=String.valueOf(n);
        if(h.length()<=3){
            return 0;
        }
        return n-1000+1;//math    
    }
}