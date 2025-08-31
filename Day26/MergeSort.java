public class MergeSort{
    public static void main(String[] args) {
        int arr[] = {2,1,4,3,6,9,8};
        
        int start = 0;
        int end = arr.length-1;

        mergeSort(arr, start, end);

        for(int r : arr){
            System.out.println(r);
        }
        
    }

    static void merge(int[] arr,int start,int mid,int end){
        
        
        int left = start;
        int right = mid+1;
        int[] temp = new int[end-start+1];
        int k=0;

        while(left <=mid && right <= end){
            if(arr[left] <= arr[right]){
                temp[k] = arr[left];
                k++;
                left++;
            } else {
                temp[k] = arr[right];
                k++;
                right++;
            }
        }

        while(left <= mid){
            temp[k] = arr[left];
            k++;
            left++;
        }

        while(right<= end){
            temp[k] = arr[right];
            k++;
            right++;
        }

        for(int i=0;i<temp.length;i++){
            arr[start+i] = temp[i];
        }
    }

    static void mergeSort(int[] arr, int start, int end){
        int mid = start + (end-start)/2;

        if(start >= end){
            return;
        }

        mergeSort(arr, start,mid);
        mergeSort(arr, mid+1,end);
        merge(arr,start,mid,end);
    }

}