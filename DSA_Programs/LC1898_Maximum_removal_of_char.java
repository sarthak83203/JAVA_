class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        //============================Amazon,Snowflake OA question========================================
        //This is Best Logic and to explore Binary Search more
        //Mine Approch is remove one string and scan for subsequence which is giving TLE
        //So best approch mid nikalo
        //uske baad mid tak utne character remove karo and check subsequence whether it is matching or not
        //so for loop chalaya mid index tak leke gaye and unko ek boolean array me true bana diya it means removed
        //then checking subsequence

        int left=0;
        int right=removable.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isPossible(s,p,removable,mid)){
                left=mid+1;//isliye kyu ki hame maximum dekhhna he agar possible he to maximum removal dekhna he

            }else{
                right=mid-1;
            }

        }  
        return right;
    }

    public boolean isPossible(String s,String p,int removable[],int k){
        //subsequence bole to in order ana chahiye compare to other string
        boolean removed[]=new boolean[s.length()];
        for(int i=0;i<k;i++){//aab mid tak jao and elemnt ko bolan array remoed as true kiya 
            removed[removable[i]]=true;
            //mid tak ke element ko nikal du to kya subsequence exists karega?
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            if(removed[i]){
                continue;
            }
            if(j<p.length() && s.charAt(i)==p.charAt(j)){
                j++;
            }

        }
        return j==p.length();
    }
}