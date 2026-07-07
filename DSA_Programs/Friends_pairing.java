//Question=> 
    /*
    Given n friends ,each one can remain single or paired up with some other friend.
    Each friend can be paired only once find out the total numberof ways in 
    which friends can remain single or paired up

    Solution=> there are choice in which the friend is to be single or paired 
    agar single he to  and if we are considering n number then the (single person) and n-1 person should form the group
     
    other one is pairs me hoga to (2 friends in pairs) and (n-2 other pairs hoge) 
                                  (par isme ek dost kisike sath bhi pair kar sakta he to hame
                                  (n-1 se multiply karna padega)) 

            Total number of ways using recursion=>f(n-1)+(n-1) * f(n-2);     


*/

    


public class Friends_pairing {
    //Goldman's sachs Interview problem
    public static int Pairing(int n){
        //pehele base case hoga
        if(n==1 || n==2){
            return n;
        }
        //abhi kaam 
        int fnm1=Pairing(n-1);
        int fnm2=Pairing(n-2);
        int pairways=(n-1) * fnm2;
        return fnm1+pairways;
    }
    public static void main(String args[]){
        System.out.println(Pairing(3));



    }
    
}
