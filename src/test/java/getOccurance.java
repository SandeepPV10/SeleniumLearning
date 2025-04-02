import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class getOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.next();
        Map<Character, Integer> map=new TreeMap<Character, Integer>();
        for (char c: str.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
      // System.out.println(map);//ip= test, op==>{e=1, s=1, t=2}
        for (Character key : map.keySet()) {
            System.out.print(key + "" + map.get(key));//ip=test, op==>e1s1t2
           }
    }
}
