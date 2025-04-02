import java.util.HashMap;

public class test008 {

    public static void test(String s) {
        HashMap<Character, Integer> map = new HashMap();
         for (char c: s.toCharArray()){
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
            System.out.print(s + map);
            //System.out.println("*********************");
//            for (Character key : map.keySet()) {
//                System.out.print(key + "" + map.get(key));
//            }
        }
    public static void main(String[] args) {
test("test");
    }
}