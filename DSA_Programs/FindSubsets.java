public class FindSubsets {
    public static void FindSubset(String str,String ans,int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes if it want to add
        FindSubset(str, ans+str.charAt(i), i+1); //here you can see that In recursive function don't just use i++ their is difference between them
        //No if it don;t want to add
        FindSubset(str, ans, i+1);


    }
    public static void main(String args[]){
        String ans="abc";
        FindSubset(ans,"", 0);
        

    }
    
}
