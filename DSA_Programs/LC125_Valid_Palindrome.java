class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){//this function  should be remember 
               sb.append(s.charAt(i));
            }
            else if(Character.isUpperCase(s.charAt(i))){//this function  should be remember 
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            else if(Character.isDigit(s.charAt(i))){//this function  should be remember 
               sb.append(s.charAt(i));
            }else{
                continue;
            }   
        }
        String h=sb.toString();
        String yu=new StringBuilder(h).reverse().toString();
        if(h.equals(yu)){
            return true;
        }

        return false;

        
    }
}