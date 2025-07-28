public class missingNumber {
    public static void main(String[] args) {
    int[] nums={0,1};
        System.out.println(missingNum(nums));

    }

    public static int missingNum(int[] nums){
        //int missingNumber=0;

        int n =nums.length;

        for(int i =0;i<nums.length;i++){
            n+=i-nums[i];
        }


        return n;
    }
}
