class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" ");
        int first=count(a[0]);

        for(int i=1;i<a.length;i++){
            if(count(a[i])==first){
                a[i]=new StringBuilder(a[i]).reverse().toString();
            }
        }
        //example=>
        //String a[]={"Hello","world","java"}
        //After writing String.join() wala usme har ek world ke baad space aa jayega String k form me 
        return String.join(" ",a);//join karo with space operator se String me convert karne ke liye



        
    }
    public int count(String str){
        String v="aeiou";
        int count=0;
        for(char ch:str.toCharArray()){
            if(v.indexOf(ch)!=-1){//kya ch charcater exists karta he vowels me
                count++;
            }
        }
        return count;

    }
}