class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int y=(int)s.charAt(i);
            String hj=Integer.toBinaryString(y);
            while(hj.length()<8){ //isme baas leading zeroes ka dyan rakhna padega ye mistake ho raha tha merese
                hj="0"+hj;
            }
            sb.append(hj);
            sb1.append(hj);

        }
        String eq1=sb.reverse().toString();
        String eq2=sb1.toString();
        if(eq1.equals(eq2)){
            return true;
        }
        return false;
        
    }
}