class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            //First i written Integer.toBinaryString it is only hard coded for Base 2
            //so if i want to convert to any base then Integer.toString(n,i) where n is number and i is base
            String p=Integer.toString(n,i);//this will convert number to any base which i want
            StringBuilder sb=new StringBuilder();
            sb.append(p);
            if(!(sb.reverse().toString().equals(p))){
                return false;

            }
        }
        return true;
        
        
    }
}