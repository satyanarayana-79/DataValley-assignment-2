import java.util.Arrays;
//import java.util.Scanner;
class Sum {
    public static void main(String[] args)
    {
        int []values={10,51,53,39,47,44,21};
        Arrays.sort(values);
        //System.out.println(values);
        int length=values.length;
        int sum=values[length-2]+values[length-3];
        System.out.println(sum);

    }
}
