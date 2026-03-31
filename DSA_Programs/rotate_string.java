 public boolean rotateString(String s, String goal) {
        //character can't be compared here
        if(s.length()!=goal.length()){
            return false;
        }
        // for(int i=0;i<s.length();i++){
        //     char first=s.charAt(0);
        //     s=s.substring(1)+first;

        //     if(s.equals(goal)){
        //         return true;
        //     }
        // }
        // return false;
        String p=s+s;
        if(p.contains(goal)){
            return true;
        }
        return false;


        
    }