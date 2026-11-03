class Solution {
    public String baseNeg2(int n) {


      //================== Boeing,Airbnb,Google OA Questions===============//
    

        //base 2 pe kaam karna he to remainder ke liye -2 and divide ke liye -2 use karo
        //TC=log(N)
        StringBuilder sb=new StringBuilder();
        if(n==0){
            return "0";
        }
        //Mathematically Formula N=>(-2*quotient+remainder)
        //agar iss formula se dekhe to hame left and right side equal karna he to +2 and +1 karna padega
        while(n!=0){
            int r=n%-2;
            n=n/-2;
            if(r<0){
                r=r+2;//converting from -1 to 1
                n=n+1;//compesanating the number means making easier to solve

            }
            sb.append(r);

        }
        return sb.reverse().toString();

        
        
    }
}