class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        //important question 

        //======================= Infosys,Amazon=================//




        //My mistake checking each condition leading to TLE
        //so take a place variable and find it remainder so that reach ot lesser sum
        
        long place=1;
        long original=n;
        //This while loop is very important to overcome TLE
        while(sum(n)>target){
            place=place*10;
            //this is method of adding remainder from the n
            long add=place-(n%place);//n mese last remainder nikalo vo direct answer dega
            n=n+add;//and this n changes in the while loop this does not change the original one
            //this n is pass to sum(n) this does not goes to upper variables on original to change


        }
        return n-original;

        
    }
    public static long sum(long m){
        long sum=0;
        while(m>0){
            sum=sum+(m%10);
            m=m/10;

        }
        return sum;
    }
}