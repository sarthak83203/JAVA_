public class merge_sort_pract {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;

        mergeSort(arr,si,mid);//left part sorted 
        mergeSort(arr, mid+1, ei); //right part sorted
        //now merging of both left and right part....
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        //now i want to take the temp arr and traversing through k 
        //and in arr i will trverse through i and j
        int temp[]=new int[ei-si+1];  //+1 because it is zero index based
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                 temp[k]=arr[i];
                 i++;
                 
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
             
        }
        //now remaining left part will also get added
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //now remaining right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //now putting the temp in ot original
        for(k=0,i=si;k<temp.length;k++,i++){ //remember the i will start from si only
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int arr[]={8,9,5,10,78,23};
        mergeSort(arr,0 , arr.length-1);
        printArr(arr);


    }
    
}
