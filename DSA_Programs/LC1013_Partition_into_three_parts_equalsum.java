class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {


       //========== Turing,Amazon,Bloomberg,Google OA Questions============//

        //pehele to  isme sum calculate karo and usse three part me divide karo
        //sum/3 isse ek part ka sum nikalega and usse compare karo baas yehi technique he
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        int target=sum/3;//mene sum ko divide kiya three part me me it means isme ek part ka sum aa h=jata he
        int count=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            j=j+arr[i];
            if(j==target){
                count++;//just parts count karna he
                j=0;
            }

            
        }
        return count>=3;


        
        
        
        
        
    }
}