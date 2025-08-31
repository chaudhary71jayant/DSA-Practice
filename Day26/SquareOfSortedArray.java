public class SquareOfSortedArray {
    public static void main(String[] args){
        int[] nums = {-7, -3, 2, 3, 11};

        int[] result = sortedSquares(nums);

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] sortedSquare(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }

        int start =0,end=nums.length-1;

        mergeSort(nums, start, end);

        return nums;
    }

    static void merge(int[] arr, int start, int mid, int end){
        int left = start;
        int right = mid+1;
        int k=0;
        int[] temp = new int[end-start+1];

        while(left <= mid && right <= end){
            if(arr[left] <= arr[rigth]){
                temp[k] = arr[left];
                k++;
                left;
            } else {
                temp[k] = arr[right];
                k++;
                right++;
            }
        }

        while(left<=mid){
            temp[k] = arr[left];
            k++;
            left;
        }

        while(right<=end){
            temp[k] = arr[right];
            k++;
            right++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];   
        }
    }

    static void mergeSort(int[] arr, int start, int end){
        int mid = start + (end-start)/2;

        if(start >= end){
            return;
        }

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
}
