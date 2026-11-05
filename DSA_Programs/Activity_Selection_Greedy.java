import java.util.*;
public class Activity_Selection_Greedy {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};//this is already sorted 


        //Agar unsorted wala mila to represent it in 2D matrix

        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //which has three coloums index,start,end
        //so sorting 2D matrix we have to use Lambda Function in Java


        //In shot sorting kis basis pe karni he ye Comparator ka kaam he
        //Arrays.sort(activities,Comparator.comparingDouble(Key Extractor)) Key Extractor => o->o[2]






        //so the Approach is Activities are sorted according to end time
        //The main Reason behind this is jitna jyada activites perform hoge utna phayda hoga
        //Inshot we are greedy for during activities

        //Making ArrayList for anaylysing which activity is performing
        ArrayList<Integer> list=new ArrayList<>();

        int maxAct=0;
        //peheli wali activity perform karni hi padegi kyuki sabse thoti pehele wali hi hogi
        list.add(0);
        maxAct=1;
        int lastEnd=end[0];;
        for(int i=1;i<end.length;i++){//here start and end have the same length
            if(start[i]>=lastEnd){
                maxAct++;
                list.add(i);
                lastEnd=end[i];//now it is updated to new end
            }

        }
        System.out.println(maxAct);

        for(int i=0;i<list.size();i++){
            System.out.print("A"+list.get(i)+" ");
        }
        System.out.println();
    }
    
}
