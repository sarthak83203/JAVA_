class Solution {
    public String getEncryptedString(String s, int k) {
        String ans="";
        for(int i=0;i<s.length();i++){
            //so cyclic find karne ke liye modulo ka kaam ayegea in most of the question
            ans=ans+s.charAt((i+k)%s.length());
        }
        return ans;
        
        
    }
}