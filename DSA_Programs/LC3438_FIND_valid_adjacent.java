class Solution {
    public String findValidPair(String s) {
        
        char c[]=s.toCharArray();
        int freq[]=new int[100];
        for(int i=0;i<c.length;i++){
            freq[c[i]-'0']++;
        }
        //read the question it is said adjacent (Missed this condition while reading the question)
        for(int i=0;i<s.length()-1;i++){
            int a=s.charAt(i)-'0';
            int b=s.charAt(i+1)-'0';
            if(a!=b && freq[a]==a && freq[b]==b){
                return ""+a+b;
            }
        }
        
        return "";
        
    }
}