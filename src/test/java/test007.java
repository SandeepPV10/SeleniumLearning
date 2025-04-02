public class test007 {
    public static void main(String[] args) {
        String str="this is Sandeep123A";
        StringBuilder alphabets=new StringBuilder();
        StringBuilder numbers=new StringBuilder();
        for (char c: str.toCharArray()){
            if (Character.isDigit(c)){
                numbers.append(c);
            }else{
                alphabets.append(c);
            }
        }
        System.out.println(alphabets);
        System.out.println(numbers);
    }
}
