public class Duplicate {

    public static void removeDuplicate(String str,int index,StringBuilder sb,boolean map[]){
        //base case
        if(index==str.length()){
            System.out.print(sb);
            return;
        }
        //kaam
        char ch=str.charAt(index);
        if(map[ch-'a']==true){
            removeDuplicate(str, index+1, sb, map);
        }else{
            map[ch-'a']=true;
            removeDuplicate(str, index+1, sb.append(ch), map);
        }

    }
    public static void main(String args[]){
        removeDuplicate("ssarrthakk", 0, new StringBuilder(),new boolean[26]);


    }
    
}
//Saarrthakk
