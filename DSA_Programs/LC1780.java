class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3==2){//isme hum ye implement kar rahe he ki jo power of three he vo ek he baar ani chahiye like 3^2+3^2 can't come this two times
                return false;
            }
            n=n/3;
        } 
        return true;       

        
    }
}