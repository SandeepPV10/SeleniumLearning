public class test002 {
    public static void main(String[] args) {
        String str = "My name is Sandeep";
        String[] newstr = str.split(" ");
        for (int i = newstr.length - 1; i >= 0; i--) {
            if (newstr[i].contains("Sandeep")) {
                StringBuilder stringBuilder=new StringBuilder(newstr[i]);
                stringBuilder.reverse();
                //System.out.print(newstr[i].toLowerCase());
            }
            else {
                System.out.print(newstr[i]+" ");
            }
        }

    }
}
