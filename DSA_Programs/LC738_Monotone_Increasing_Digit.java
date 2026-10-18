class Solution {
    public int monotoneIncreasingDigits(int n) {
        //So here we are checking one by one digit 
        // while(true){//kyuki vapis n-- hote hi n-- wale ko traverse karna padega isliye
        //    String h=String.valueOf(n);
        //    boolean flag=true;
        //    for(int i=0;i<h.length()-1;i++){
        //       if(h.charAt(i)>h.charAt(i+1)){
        //         flag=false;
        //         break;
        //      }
        //    }
        //    if(flag){
        //     return n;
        //    }
        //    n--;

        // }

        //now here optimal approach
        //dekho 332 he 2 koo hum increase nahi karsakte nahi to number badha ho jayega 
        //hum digit ko decrease karna chalu karege


        //==================Credit Karma,Amazon,Google OA question ========//
        //Logical Question I need to Think more in Greedy Algo
        
        char arr[]=String.valueOf(n).toCharArray();
        int mark=arr.length;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]>arr[i]){//for 332   3>2 so the arr becomes [3,2,2]
            //at last iteration the arr becomes [2,2,2] and mark=1;
                arr[i-1]--;
                mark=i;
            }

        }
        for(int i=mark;i<arr.length;i++){
            arr[i]='9';//abhi greater find kara he to 9 dalo
            //9 isliye dala kyu ki first digit decrease hua he 
        }
        return Integer.parseInt(new String(arr));       
    }
}