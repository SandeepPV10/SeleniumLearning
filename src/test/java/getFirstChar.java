import java.util.Scanner;

public class getFirstChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
       // String str="India is my country";
        String str= sc.next();

        String[] newStr=str.split(" ");
        for (int i=0;i< newStr.length;i++){
            System.out.print(newStr[i].charAt(0)+" ");
        }
    }
}
