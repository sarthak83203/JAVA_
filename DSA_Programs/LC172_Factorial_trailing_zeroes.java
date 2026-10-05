class Solution {
    public int trailingZeroes(int n) {
        //+++=========Google,Amazon========
        int count=0;
        //Inshot we have to just check the factors of 5
        while(n>0){
            n=n/5;//just think
            count=count+n;
        }
        return count;
        
    }
}