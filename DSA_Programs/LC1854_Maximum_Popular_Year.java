class Solution {
    public int maximumPopulation(int[][] logs) {
        //maximum popular year is like like person is alive on 1st year that is 
        //alive on the 1993 and die at the 1998 according to first case
        //now isme constraint diya he ki 1950 birth and death is 2050 it means total 101 year are there
        //so year naam ka array bayege jisme +1 store karege vo alive he and -1 uski death hua he
        //isme cols to 2 hi hoge birth and death

        //year ka size 101 he to vo Whatever difference comes us index pe jakar +1 save hoga
 

        int year[]=new int[101];
        for(int i=0;i<logs.length;i++){
            year[logs[i][0]-1950]++;//ye chij thodi sochna critical tha 1950 se subtract karne ka
            year[logs[i][1]-1950]--;
        }
        int ans=0;
        int population=0;
        int maxPopulation=0;
        for(int i=0;i<year.length;i++){
            population=population+year[i];//year +1 hoga tab tak 0 hoga jab tak -1 nahi aat
            if(population>maxPopulation){
                maxPopulation=population;
                ans=i+1950;//jis index pe ayega utna time index ko + karege
            }
        } 
        return ans;       
    }
}