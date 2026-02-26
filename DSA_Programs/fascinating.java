public boolean isFascinationg(int n){
     HashSet<Integer> list=new HashSet<>();
        for(int i=1;i<10;i++){
            list.add(i);

        }
        int p=n;
        int q=2*n;
        int r=3*n;
        String yu=Integer.toString(p);
        String yu1=Integer.toString(q);
        String yu2=Integer.toString(r);
        String ty=yu+yu1+yu2;
       for(int i=0;i<ty.length();i++){
        int ru=ty.charAt(i)-'0';
        if(!list.contains(ru)){
            return false;

        }
        list.remove(ru);
       }
        return list.isEmpty();

       
        
}