class Solution {
    public int findJudge(int n, int[][] trust) {
        int inward[]=new int[n+1];  //how many people trusted this
        int outward[]=new int[n+1]; //how many people they trust
        //like 1--->2 1 is trusting 2 and we will count this how many trusted and how many trust
        for(int t[]:trust){
            //this takes each row of trust
            outward[t[0]]++;
            inward[t[1]]++;

        }
        //like this will count the how many person t[0] trust and how many person t[1] that is trusted

        for(int i=1;i<=n;i++){
            if(inward[i]==n-1 && outward[i]==0){
                return i;
            }

        }
        return -1;



        
    }
}