public class MerginArrays {
     static  void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0,right=0,k = 0;
        int[] temp = new int[m+n];

        while(left < m && right < n){
            if(nums1[left] <= nums2[right]){
                temp[k] = nums1[left];
                k++;
                left++;
            }else{
                temp[k] = nums2[right];
                k++;
                right++;
            }
        }

        while(left<=m-1){
            temp[k] = nums1[left];
            k++;
            left++;
        }

         while(right<=n-1){
            temp[k] = nums2[right];
            k++;
            right++;
        }
        
        for(int i=0;i<temp.length;i++){
            nums1[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3, n=3;

        merge(nums1, m, nums2, n);

        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }
}
