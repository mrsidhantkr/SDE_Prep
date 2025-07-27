public class CheckArrayisSortedAndRotated {
    public static void main(String[] args) {

           int[] nums={2,1,3,4};
        System.out.println(check(nums));
    }


    static boolean check (int[] nums){
        int countBreakPoints = 0;
        int length = nums.length;
        for(int i =0;i<length-1;i++){
            if(nums[i]>nums[i+1]){
                countBreakPoints++;
            }
        }


        if(nums[length-1]>nums[0]){
            countBreakPoints++;
        }
        return countBreakPoints<=1;
    }
}
