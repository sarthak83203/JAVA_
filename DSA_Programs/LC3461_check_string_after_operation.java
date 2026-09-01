class Solution {
    public boolean hasSameDigits(String s) {
        //abhi isme ye check karna he ki string ka length total two hona chahiye
        while(s.length()>2){//hume bass two digit kat hi chahiye isliye while loop
            StringBuilder sb=new StringBuilder();//abhi isme stringBuilder ki jarirat padegi kyuki overall pura number collect karne keliye
            for(int i=0;i<s.length()-1;i++){
                int y=((s.charAt(i)-'0'+s.charAt(i+1)-'0')%10);
                sb.append(y);
            }
            s=sb.toString();
        }
        if(s.charAt(0)==s.charAt(1)){
            return true;
        }
        return false;
        
    }
}