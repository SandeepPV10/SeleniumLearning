import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        String newStr="";
        for (int i=str.length()-1;i>=0;i--){

           newStr=newStr+str.charAt(i);
        }
        System.out.println(newStr);
        if(str.equals(newStr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
