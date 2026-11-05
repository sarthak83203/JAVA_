class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        //============Zepto,Google,Bloomberg,Google OA Questions===========//
        for(int i=0;i<arr1.length;i++){
            //In shot isme ye dekhana he ki distance > d ho 
            //<d he to invalid he
            boolean valid=true;//jab vapis i loop chalega tab valid true ho jayega again
            for(int j=0;j<arr2.length;j++){
                int s=Math.abs(arr1[i]-arr2[j]);
                if(s<=d){
                    valid=false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;

        
    }
}