class Solution {
    public static void merge(int[] arr, int[] left, int[] right){
        int i = 0, j = 0,k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i<left.length){
            arr[k++] = left[i++];
        }
        while(j<right.length){
            arr[k++] = right[j++];
        }
    }
    public static void Merge_Sort(int[] arr){
        if(arr.length >1){
            int mid = arr.length/2;
            int[] left = Arrays.copyOfRange(arr,0,mid);
            int[] right = Arrays.copyOfRange(arr,mid,arr.length);

            Merge_Sort(left);
            Merge_Sort(right);

            merge(arr,left,right);
        }
    }
    public int[] sortArray(int[] nums) {
        Merge_Sort(nums);
        return nums;
    }
}