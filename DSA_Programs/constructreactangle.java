public int[] constructRectangle(int area){
    int length=0;
    int width=0;
    for(int i=1;i*i<=area;i++){
        if(area%i==0){
            width=i;
            length=area/width;
        }
    }
    int arr[]=new int[2];
    arr[0]=length;
    arr[1]=width;
    return arr;

}