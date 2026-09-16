class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        //Question =>
            //Hume aise words count karne he jo start vowels se ho rahe ho and and end bhi vowels se ho rahe ho
        int count=0;
        for(int i=left;i<=right;i++){
            String h=words[i];
            int len=h.length()-1;
            if((h.charAt(0)=='a'||h.charAt(0)=='e' || h.charAt(0)=='i' || h.charAt(0)=='o' ||h.charAt(0)=='u') && (h.charAt(len)=='a' || h.charAt(len)=='e' || h.charAt(len)=='i' || h.charAt(len)=='o' || h.charAt(len)=='u')){
                count++;
            }
        }
        return count;


        
    }
}