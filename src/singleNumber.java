public class singleNumber {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,3,4,3};
        System.out.println(singleNum(nums));
    }

    public static int singleNum(int[] nums){
        int ans = 0;
        for(int num:nums){
            ans^=num;
        }

        return ans;
    }
}
