import java.util.Arrays;

public class test005 {


    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        else {
            char S1[] = s1.toLowerCase().toCharArray();
            char S2[] = s2.toLowerCase().toCharArray();

            Arrays.sort(S1);
            Arrays.sort(S2);

            return Arrays.equals(S1,S2);
            }

    }
        public static void main (String[]args){

            System.out.println(isAnagram("Listen","Silent"));
            System.out.println(isAnagram("Listen","sandip"));
        }
    }

