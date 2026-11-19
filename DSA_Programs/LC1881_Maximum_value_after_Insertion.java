class Solution {
    public String maxValue(String n, int x) {

        //=============== Amazon OA Question===============//


        // StringBuilder sb=new StringBuilder();
        // ArrayList<Integer> list=new ArrayList<>();
        // int y=Integer.parseInt(n);
        // int temp=Math.abs(y);
        // while(temp>0){
        //     list.add(temp%10);
        //     temp=temp/10;
        // }
        // list.add(x);
        // Collections.sort(list);
        // if(y<0){
        //     sb.append('-');
        // }
        // for(int j:list){
        //     sb.append(j);
        // }
        // return sb.toString();

        //isme me sorting nahi kar sakta beacause the original position same rehna chahiye

        StringBuilder sb=new StringBuilder();
        if(n.charAt(0)=='-'){
            for(int i=1;i<n.length();i++){
                if(n.charAt(i)-'0'>x){//take the example -456 and x=4
                //5>4 so maximum banana he to 4 ko pehele insert karna padega that is x
                    sb.append(n.substring(0,i));
                    sb.append(x);
                    sb.append(n.substring(i));
                    return sb.toString();    
                }

            }
        }else{
            for(int i=0;i<n.length();i++){
                if(n.charAt(i)-'0'<x){
                    sb.append(n.substring(0,i));//n.substring(0,0) return empty string
                    sb.append(x);
                    sb.append(n.substring(i));
                    return sb.toString();
                }

            }
        }
        //ye tab hoga jab test case 999 and x=5 hoga hoga
        return n+x;







        
    }
}