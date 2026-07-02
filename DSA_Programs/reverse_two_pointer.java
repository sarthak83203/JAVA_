// Given a string s, reverse the string according to the following rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.

 

// Example 1:

// Input: s = "ab-cd"
// Output: "dc-ba"
// Example 2:

// Input: s = "a-bC-dEf-ghIj"
// Output: "j-Ih-gfE-dCba"
// Example 3:

// Input: s = "Test1ng-Leet=code-Q!"
// Output: "Qedo1ct-eeLg=ntse-T!"

class Solution {
    public String reverseOnlyLetters(String s) {
        char sp[]=s.toCharArray();
        int left=0;
        int right=sp.length-1;
        //using two pointer approach
        while(left<right){
            if(!Character.isLetter(sp[left])){
                left++;
            }
            else if(!Character.isLetter(sp[right])){
                right--;
            }else{

                char temp=sp[left];
                sp[left]=sp[right];
                sp[right]=temp;
                left++;
                right--;

            }
           

        }
        StringBuilder sb=new StringBuilder();
        for(char k:sp){
            sb.append(k);
        }
        return sb.toString();
        
    }
}