public class test100 {
    public static void main(String[] args) {
        String str="ABC";
        String res="";
        for(char c: str.toCharArray()){
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.charAt(c);
            System.out.println(c);
        }
    }

}
