public class tower_of_hanoi {
    public static void tower(int n,String src,String helper,String Dest){
        if(n==1){
            System.out.println("Transferred disk"+n +" from"+src+ " to "+Dest);
            return;
        }
        tower(n-1, src, Dest, helper);
        System.out.println("Transferred disk"+n +" from"+src+ " to "+Dest);//now seeing which disk  is transferred when
        tower(n-1, helper, src, Dest);

    }
    public static void main(String args[]){
        
        tower(2, "S", "H", "D");

    }
    
}
