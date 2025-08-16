import java.util.Arrays;

public class reverseaString {
    public static void main(String[] args) {

       funcc(0);


    }

    static void reverse(String s){


        int n = s.length();
        int[] arr =new int[n];

        for(int i =n-1;i>=0;i--){
            arr[i]=s.charAt(i);

        }

        System.out.println(Arrays.toString(arr));

    }



    static void funcc(int c){
      //  int counter=0;
        System.out.println(c);
        if(c>=3){
            System.out.println("Done!");
            return;
        }

        funcc(c+1);
    }
}
