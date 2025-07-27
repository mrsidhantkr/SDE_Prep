public class RotateArray {
    public static void main(String[] args) {

        int[] nums ={1,2,3,4,5,6,7};
        rotate(nums,3);

    }

     public static void rotate(int[] nums,int k ){
        k=k%nums.length;

        int n =nums.length;

        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);

        for(int i =0;i<n;i++){
            System.out.print(nums[i]);
        }


     }

     public static void swap(int[] nums,int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
     }
}
