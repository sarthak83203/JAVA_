class Solution {
    public boolean validPalindrome(String s) {
        //if i want to delete then i have to see for the start+1 or end-1 karo dono mese 
        //isme hame banana padega ispalindrome to check whether it is palindrome or not
        //if the character is 1 the it is palindrome
        //single character is palindrome
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return ispalindrome(s,start+1,end) || ispalindrome(s,start,end-1);//this is skipping ony one character either from the end or from start


            }
            start++;
            end--;
        }
        return true;
    
    }
    //now check whether the skipping chracter makes the palindrome or not
    //here i will pass  what to skip and this function will check that part
    public  boolean ispalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }

}