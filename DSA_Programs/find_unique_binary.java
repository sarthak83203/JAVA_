public String find_unique_binary(String nums[]){
    StringBuilder list=new StringBuilder();
    for(int i=0;i<nums.length;i++){
        char c=nums[i].charAt(i);
        if(c=='0'){
            list.append(1);
        }
        else{
            list.append(0);
        }
    }
    return list.toString();
}