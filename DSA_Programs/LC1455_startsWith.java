class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String s[]=sentence.split(" ");
        for(int i=0;i<s.length;i++){
            if(s[i].startsWith(searchWord)){//startsWith function help to check whether the word is starting with that seach word or not
                //to reduce the steps remember thd startsWith function
                //can't use contains beacause it is talikg  the prefix startsWith checks the whether the word is starting with that search word
                return i+1;
            }
        }
        return -1;
        
    }
}