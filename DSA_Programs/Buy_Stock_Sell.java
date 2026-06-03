import java.util.*;
public class Buy_Stock_Sell {
    public static int Stock(int arr[]){
        int buyPrice=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(buyPrice<arr[i]){
                int profit=arr[i]-buyPrice;
                max=Math.max(max,profit);
            }else{
                buyPrice=arr[i];
            }
        }
        return max;

    }
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        System.out.println(Stock(arr));

    }
    
}
