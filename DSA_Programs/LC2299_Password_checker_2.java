class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int lower=0;
        int upper=0;
        int digit=0;
        int special=0;
        for(int i=0;i<password.length()-1;i++){
            if(password.charAt(i)==(password.charAt(i+1))){
                return false;
            }
        }
        for(int i=0;i<password.length();i++){
            
            if(Character.isLowerCase(password.charAt(i))){ //Character.isLowerCase checks whether it is lower or not and Character.toLowerCase chnages in to smaller character
                lower++;
            }else if(Character.isUpperCase(password.charAt(i))){//Character.isUpperCase checks whether it is upper or not and Character.toUpperCase chnages in to upper character
                upper++;
            }else if(Character.isDigit(password.charAt(i))){
                digit++;
            }else{
                special++;
            }


        }
        if(password.length()>=8 && lower>=1 && upper>=1 && digit>=1 && special>=1){
            return true;
        }
        return false;

        
    }
}