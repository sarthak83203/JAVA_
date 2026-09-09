class Solution {
    public int minLength(String s) {
        //work this problem with StringBuilder
        StringBuilder sb=new StringBuilder(s);
        String sub1="AB";
        String sub2="CD";
        while(true){
            int start=sb.indexOf(sub1);//S string me sub1 ka index kya he
            //Mine mistake mene sb ki jagah s likha tha jo ki original string thi 
            if(start!=-1){
                sb.delete(start,start+2);
            }
            int end=sb.indexOf(sub2);//S string me sub2 ka index kya he
            if(end!=-1){
                sb.delete(end,end+2);
            }
            if(start==-1 && end==-1){//agar dono nahi he to break karo
                break;
            }
        }
        return sb.length();     
    }
}