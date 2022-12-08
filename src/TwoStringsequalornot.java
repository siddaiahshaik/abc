import java.util.HashMap;
import java.util.Map;

public class TwoStringsequalornot {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "eloho";

        Map<Character,Integer> m=new HashMap<>();

        if(str1.length() == str2.length()){

            for (int i=0; i<str1.length();i++){
                if (m.containsKey(str1.charAt(i))){

                    m.put(str1.charAt(i),m.get(str1.charAt(i))+1);

                }else{
                    m.put(str1.charAt(i),1);
                }
            }
            for (int i=0; i<str2.length();i++){
                if (m.containsKey(str2.charAt(i))){

                    m.put(str1.charAt(i),m.get(str1.charAt(i))-1);
                }
            }

        }else{
            System.out.println("Strings are not equal");
        }

        System.out.println(m);
    }
}
