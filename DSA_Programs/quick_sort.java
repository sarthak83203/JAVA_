public class quick_sort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void quickSort(int arr[],int si,int ei){
        //now finding the positionof pivot element based on partion index
        if(si>=ei){
            return;
        }
        int partition=quicks(arr,si,ei);
        quickSort(arr, si, partition-1);//left side sorting 
        quickSort(arr,partition+1, ei);//right side sorting
    }

    public static int quicks(int arr[],int si,int ei){
        int pivot=arr[ei];
        //if the pivot element is smaller then swapping
        int i=si-1;
        for(int j=si;j<ei;j++){//before pivot element
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }
        //pivot ko sahi jagah dalo aab
        i++;
        int temp=pivot;
        arr[ei]=arr[i];//variable ke change function ke andhar change nahi hote so (no pivot=arr[i])
        arr[i]=temp;
        return i; 
    }


    public static void main(String args[]){
        int arr[]={8,7,6,5,4,-5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);


    }
    
    
}
