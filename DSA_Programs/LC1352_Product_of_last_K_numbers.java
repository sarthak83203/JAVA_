import java.util.*;
class ProductOfNumbers {


    //=========== Target,StarBucks,Tekion,ByteDance,Apple,Amazon OA Questions=========//

    //Mine Appraoch is Brute force but optimize Approach is prefix sum
    //isme hum jo element dalege list me vo pichale wale se multiple hokar add hoga
    //Ye optimal isliye he kyuki hum last me calculated value ko direct return kar dege
    //jab ki brute force me hum element ko dalege phir multiple karege which takes time

    ArrayList<Integer> list;

    public ProductOfNumbers() {
        list=new ArrayList<>();  
        list.add(1);   
    }
    
    public void add(int num) {
        // list.add(num);
        if(num==0){
            list.clear();//0 pure product ko zero bana dega 
            list.add(1);
        }else{
            int last=list.get(list.size()-1);
            list.add(last*num);
        }   
    }
    
    public int getProduct(int k) {
        // int pro=1;
        // for(int i=list.size()-k;i<list.size();i++){
        //     pro=pro*list.get(i);
        // }
        // return pro;
        if(k>=list.size()){//abhi ye condition kaam ayegi agar maan lo ki
        //first test case me bola last 4 then our list will be less size as compare to k direct return 0
            return 0;
        }
        int n=list.size();
        return list.get(n-1)/list.get(n-k-1);
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */