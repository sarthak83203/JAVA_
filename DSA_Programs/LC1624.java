class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // HashSet<Character> set=new HashSet<>();
        // int count=0;
        // set.add(s.charAt(0));
        // for(int i=1;i<s.length()-1;i++){
        //     if(!set.contains(s.charAt(i))){
        //         return -1;
        //     }
        // }
        
        // for(int i=1;i<s.length()-1;i++){
        //     if(!set.contains(s.charAt(i))){
        //         count++;
        //     }
        // }
        // return count;

        //read the question properly
        //want to find the maximum
        int arr[]=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=-1;//all are not there assuming
        }
        int max=-1;
        for(int i=0;i<s.length();i++){
            int sd=s.charAt(i)-'a';
            if(arr[sd]==-1){
                arr[sd]=i;
            }else{
                max=Math.max(max,i-arr[sd]-1);
            }

        }
        return max;


        
    }
}