import java.util.HashMap;
import java.util.Map;

public class test1001 {
    public static void main(String[] args) {
        //a11abccc22deeffff- Print repeating letters with num of occurrence, excluding the numerics
        String str="a11abccc22deeffff";
        Map<Character, Integer>map=new HashMap<Character, Integer>();
        for (char c:str.toCharArray()){
            if(!Character.isDigit(c)){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
            }
        }
        //System.out.println(map);
        for (Character key: map.keySet()){
           if(map.get(key)>1){
               System.out.println(key+"==>"+map.get(key));
           }
        }

    }
}
