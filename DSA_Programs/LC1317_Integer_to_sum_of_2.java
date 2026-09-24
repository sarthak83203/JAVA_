class Solution {
    public int[] getNoZeroIntegers(int n) {
        //This Approach is O(n^2) it gives TLE 
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i+j==n && !String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")){
        //             list.add(i);
        //             list.add(j);
        //             break;
        //         }
        //     }
        // }
        // int arr[]=new int[2];
        // int j=0;
        // for(int i=0;i<2;i++){
        //     arr[j++]=list.get(i);
        // }
        // return arr;
        for(int i=1;i<=n;i++){
            int j=n-i;
            if(i+j==n && !String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")){
                  return new int[]{i,j};
            }
        }
        return new int[0];

        
    }
}