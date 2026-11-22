class Solution {
    public String fractionAddition(String expression) {

    //========IXL,Trilogy,Zopsmart,Google OA Questions==========//
    //===========This question is important according to logic========//
    //DEKH LENA ISS APPROACH KO BEFORE ALL THE OA'S===========//

        int num=0;
        int den=1;
        //TC=O(N)
        int i=0;//ye me traverse karne ke liye use kar raha hu
        while(i<expression.length()){
            int sign=1;
            if(expression.charAt(i)=='-'){//ye sign ke liye check ho raha he
                sign=-1;
                i++;
            }else if(expression.charAt(i)=='+'){
                i++;
            }
            int n=0;//This is my new Numerator
            //Mine mistake me soch raha tha ki if else se kaam ho jayega par 
            //isme agar numerator hi 12  aise hua to if-else does not work
            while(i<expression.length() && Character.isDigit(expression.charAt(i))){
                n=n*10+expression.charAt(i)-'0';
                i++;
            }
            i++;//this will skip the '/'

            n=n*sign;//sign numerator ke sath hogi
            int d=0;//this is my new Denominator now
            while(i<expression.length() && Character.isDigit(expression.charAt(i))){
                d=d*10+expression.charAt(i)-'0';
                i++;
            }
            

            //now adding the fractiono to inital one
            num=num*d+n*den;
            den=den*d;
            //now mujhe actual numerator and Denomenator mil gaya but i want simplify one like
            //50/100=>1/2 like this so think about GCD 
            int GCD=gcd(Math.abs(num),den);
            num=num/GCD;
            den=den/GCD;
            
        }
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        sb.append('/');
        sb.append(den);
        return sb.toString();

        
    }
    //TC=O(log(M))
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}