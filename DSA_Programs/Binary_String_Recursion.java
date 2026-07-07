
/*Question=>
    Binary Strings problem
    print all the binary string of size N without concecutive ones....
    */



public class Binary_String_Recursion {
    //Paytm Question
    public static void Binary(int n,int lastIndex,String sb){
        if(n==0){
            System.out.println(sb);
            return;
        }
        Binary(n-1, 0, sb+"0");
        if(lastIndex==0){ //agar last me 0 he to 1 ko bhitha dena vaise to 0 ko haar baar bhitha to  rahe he
            Binary(n-1, 1, sb+"1"); //lastIndex represent uss  number ko bhitha diya he
        }
    }
    public static void main(String args[]){
        Binary(3, 0,"");



    }
    
}
