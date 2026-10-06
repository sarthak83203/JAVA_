class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);//ek hi string me chnage karte jayege
        for(int i=0;i<s.length();i++){//we can use while loop istead it will become easy
            if(sb.toString().contains(part)){
                int index=sb.indexOf(part);//this captures the starting index of the part
                sb.delete(index,index+part.length());
            }
        }
        return sb.toString();
        
    }
}