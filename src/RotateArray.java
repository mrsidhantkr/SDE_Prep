public class RotateArray {
    public static void main(String[] args) {

        int[] nums ={1,2,3,4,5,6,7};
        rotate(nums,3);

    }

     static void rotate(int[] nums,int k ){
        for(int i =0;i<nums.length;i++){
            swap(nums,nums[i],nums[nums.length-1]);
        }

        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
