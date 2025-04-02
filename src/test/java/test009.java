import java.util.Arrays;

public class test009 {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40};
        int firstHigh= arr[0], second=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>firstHigh){
                second=firstHigh;
                firstHigh=arr[i];
            } else if (arr[i]>second) {
                second=arr[i];
            }
        }
        System.out.println("second largest :"+ second);
    }
}
