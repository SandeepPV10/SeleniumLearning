public class test003 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+"----"+b);
//        int t = a;
//        a=b;
//        b=t;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+"----"+b);
    }
}
