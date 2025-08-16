import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormofInteger {
    public static void main(String[] args) {
        int[] nums={1,2,0,0};
        int k = 34;
        System.out.println(functt(nums,k));

    }



    public static List<Integer> functt(int[] nums,int k){
       // int k =0;
        StringBuilder b =new StringBuilder();
        for(int n:nums){
            b.append(n);
        }

        String s = String.valueOf(Long.parseLong(b.toString())+k);
        List<Integer> ans = new ArrayList<>();
        for(char c:s.toCharArray()){
            ans.add(c-'0');
        }

        return ans;

    }
}
