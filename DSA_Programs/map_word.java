public class map_word {
   
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String num:words){
            int sum=0;
            char arr[]=num.toCharArray();
            for(char ch:arr){
                sum=sum+weights[ch-'a']; //in this weights of each character is  given ch-'a' will give exact position of that character
            }
            int h=sum%26;
            sb.append((char)('z'-h));
        }
        return sb.toString();


        
    }

    
}
