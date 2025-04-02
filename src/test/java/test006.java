import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class test006 {

    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>(Arrays.asList("Java", "Sle", "Java"));
        System.out.println(str);
        for (String s : str) {
            System.out.println(s);
            System.out.println("***********");
        }
        Iterator<String>itr=str.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
                itr.remove();
                System.out.println(itr.next());
            }
        }
    }


