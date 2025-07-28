public class moveZeros {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        moveZ(nums);

    }

    public static void moveZ(int[] nums){
        int count= 0;
        int index = 0;


        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;

            }
        }
        for(int i =index;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
