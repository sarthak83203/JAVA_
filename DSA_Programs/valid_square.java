
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
          int d1 = (int)Math.pow((p1[0] - p2[0]), 2) +
                 (int)Math.pow((p1[1] - p2[1]), 2);

        int d2 = (int)Math.pow((p1[0] - p3[0]), 2) +
                 (int)Math.pow((p1[1] - p3[1]), 2);

        int d3 = (int)Math.pow((p1[0] - p4[0]), 2) +
                 (int)Math.pow((p1[1] - p4[1]), 2);

        int d4 = (int)Math.pow((p2[0] - p3[0]), 2) +
                 (int)Math.pow((p2[1] - p3[1]), 2);

        int d5 = (int)Math.pow((p2[0] - p4[0]), 2) +
                 (int)Math.pow((p2[1] - p4[1]), 2);

        int d6 = (int)Math.pow((p3[0] - p4[0]), 2) +
                 (int)Math.pow((p3[1] - p4[1]), 2);

        int arr[] = {d1, d2, d3, d4, d5, d6};
        Arrays.sort(arr);
        return arr[0]>0 && arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3] && arr[3]==arr[4] && arr[4]==arr[5];
        
    }
