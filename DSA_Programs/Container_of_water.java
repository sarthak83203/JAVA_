import java.util.*;
public class Container_of_water {
    public static int maxwater(ArrayList<Integer> list){
        int max=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int h=Math.min(list.get(i),list.get(j));
                int wi=j-i;
                max=Math.max(max,h*wi);


            }
        }
        return max;


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int hu=maxwater(list);
        System.out.println(hu);
    }
    
}
