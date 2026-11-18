class Solution {
    public int minChanges(String s) {


        //==========Bloomberg,Google OA Questions============//

        //Mine Mistake i am not doing i+=2 i am checking 0 and 1 two times
        //isme hame partition karna he
        //1101 is example isme 11 partitiono ho gaya
        //isme aab 10 ko nahi dekhna he 
        //kyuki partition karna he and even length bola he to i+=2 times chalega loop
         
        int count=0;
        for(int i=0;i<s.length();i+=2){//even length pe partition hoga
            if(s.charAt(i)!=s.charAt(i+1)){
                count++;
            }
        }
        return count;

        
        
    }
}