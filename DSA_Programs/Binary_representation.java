import java.math.BigInteger;
public int numStep(String s){
    BigInteger y=new BigInteger(s,2);
        BigInteger p=BigInteger.ZERO;
         BigInteger one=new BigInteger("1");
        BigInteger two=new BigInteger("2");
        int count=0;
        while(!y.equals(BigInteger.ONE)){
            if(y.mod(two).equals(BigInteger.ZERO)){
                p=y.divide(two);
                count++;
            }else{
                p=y.add(one);
                count++;
            }
            y=p;

        }
        return  count;
        
    }
