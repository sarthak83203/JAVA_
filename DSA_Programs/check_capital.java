    public boolean detectCapitalUse(String word) {
       if(word.equals(word.toUpperCase())||
       word.equals(word.toLowerCase())||
       word.equals(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
       ){
        return true;
       }
       return false;
    }
        
