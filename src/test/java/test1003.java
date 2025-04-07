import java.util.Arrays;
import java.util.Collections;

public class test1003 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] res=new int[a.length];

        for (int i=0;i> a.length-1;i++){
            res[i]=a[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
