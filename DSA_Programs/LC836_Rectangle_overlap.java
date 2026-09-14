class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        //here we want to see the overlap of rec1 and rec2
        return (rec1[0]<rec2[2] && rec2[0]<rec1[2] && 
        rec1[1]<rec2[3] && rec2[1]<rec1[3]);
        
    }
}