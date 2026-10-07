import java.util.*;
import java.util.LinkedList;
public class Queue_first_non_repeating_char {

    //=================Flipkart OA Question
    public static void printNonrepeat(String str){
        //Approach 
        //1st to find a  freq of each character
        //then first add the character to Queue and calculate the freq
        //then check whether the queue fron char is having non-repeating character or not
        //tc=O(n)
        Queue<Character> q=new LinkedList<>();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);//queue me add hua 
            freq[ch-'a']++;//increase of freq
            while(!q.isEmpty() && freq[q.peek()-'a']>1){//abhi queue me element filled up hua he to empty nahi he and peek element ki freq agar 
                //jyada he to remove
                //q.peek()-'a' this is for to track the exact index
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.err.print(q.peek()+" ");
            }


        }


    }

    public static void main(String args[]){
        String str="aabccxb";
        printNonrepeat(str);


        
    }
    
}
