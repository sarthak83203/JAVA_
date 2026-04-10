public List<String> string_matching(String [] words){
    ArrayList<String> list=new ArrayList<>();
    for(int i=0;i<words.length;i++){
        for(int j=0;j<words.length;j++){
            if(i!=j && words[j].contains(words[i])){
                list.add(words[i]);

            }
        }
    }
    return list;
}