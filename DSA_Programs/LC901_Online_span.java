import java.util.*;
class StockSpanner {
    Stack<Integer> st;
    ArrayList<Integer> list;

    public StockSpanner() {
        st=new Stack<>();//ye stack he jisme prehigh wale ke index store hoge (important index)
        list=new ArrayList<>();//isme span it means number of days back me dekhna padega  
    }
    
    public int next(int price) {
        //ye price mese ek ek element ayega list me so accoedingly size matter karega

        list.add(price);//first day ka span hamesha one hoga because we assume it as a high so it will be one
        int i=list.size()-1;//no need of "for loop" just i will get one by one value and it will get traverse automatically 
        if(i==0){
            st.push(0);
            return 1;
        }
        
        int span;
        
            while(!st.isEmpty() && list.get(i)>=list.get(st.peek())){
                st.pop();
            }
          
            if(st.isEmpty()){
                span=i+1;

            }else{
                int prev=st.peek();
                span=i-prev;
            }

            st.push(i);
        
        return span;

        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */