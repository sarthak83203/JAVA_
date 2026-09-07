class Solution {
    public boolean digitCount(String num) {
        int count[]=new int[10];//for this read question
        for(int i=0;i<num.length();i++){
            count[num.charAt(i)-'0']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++){//remember one thing like if take till count so 
        //usme 1 2 1 0 000000000 aise ayega and comparing with 1210 will give false
       //isme agar num.length tak lega to baas utne hi number ayege jitne chahiye
       //and this is my mistake
            sb.append(count[i]);
        }
        String b=sb.toString();
        if(b.equals(num)){
            return true;
        }
        return false;
    }
}