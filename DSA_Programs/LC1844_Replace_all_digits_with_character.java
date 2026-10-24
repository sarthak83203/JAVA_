class Solution {
    public String replaceDigits(String s) {
        //====Google OA question==========//
        char arr[]=s.toCharArray();
        for(int i=1;i<arr.length;i+=2){//this is thinking part number even pe he to +2 times aage badhao loop ko
        //so the number will be previous char+that number adding gives other
        //inshot prevous char+int of current element
            arr[i]=(char)(arr[i-1]+(arr[i]-'0'));

        }
        StringBuilder sb=new StringBuilder();
        for(char i:arr){
            sb.append(i);
        }
        return sb.toString();


        
    }
}