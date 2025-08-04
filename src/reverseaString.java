import java.util.Arrays;

public class reverseaString {
    public static void main(String[] args) {

        String s ="ABC";
        reverse(s);



    }

    static void reverse(String s){


        int n = s.length();
        int[] arr =new int[n];

        for(int i =n-1;i>=0;i--){
            arr[i]=s.charAt(i);

        }

        System.out.println(Arrays.toString(arr));

    }
}
