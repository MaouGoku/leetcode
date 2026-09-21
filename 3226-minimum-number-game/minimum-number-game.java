class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = nums;
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
          }
        }
        for(int i=1;i<arr.length;i+=2){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        return arr;
    }
}