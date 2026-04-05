public String[] occurance_Bigram(String text,String first,String second){
    String[] s=text.split(" ");
    ArrayList<String> list=new ArrayList<>();
    for(int i=0;i<s.length-2;i++){   //it will stop at length-2 beacause if i am taking i+2 it will go outofbound
        if(s[i].equals(first) && s[i+1].equals(second)){
            list.add(s[i+2]);
        }
    }
    return list.toArray(new String[0]);   //important converting ArrayList to String new syntax....
    //For int=> Integer[] s=list.toArray(new Integer[0]);

}