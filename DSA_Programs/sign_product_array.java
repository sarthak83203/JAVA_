//Concept of BIGINTEGER
import java.math.BigInteger;
public int sign_product_array(int nums[]){
    BigInteger pro=BigInteger.ONE;
    for(int i:nums){
        pro=pro.multiply(BigInteger.valueOf(i));

    }
    int result=pro.signum();  //check the sign remember this
    if(result>0){
        return 1;
    }
    if(result==0){
        return 0;
    }
    return -1;
}