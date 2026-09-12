class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(i>0 && 
            //to lowercase me kiya iska matlab ye nahi ki vo hamesha ke liye lowercase hua he 
            //we are check for particular character whether if i convert to lowercase it is matching or not it is not updated in sb the condition is checking 
            //does not mean go inside sb and change the character
              (Character.toLowerCase(sb.charAt(i))==Character.toLowerCase(sb.charAt(i-1))) &&
               Character.isLowerCase(sb.charAt(i))!=Character.isLowerCase(sb.charAt(i-1))){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                //wapis se start karo and check whether the bad pair exists or not again
                i=i-2;//because may be some bad pair may be exists like second test case

            }
        }
        return sb.toString();

        

        
    }
}