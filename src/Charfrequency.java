import java.util.HashMap;
import java.util.Map;

public class Charfrequency {


    public static void main(String[] args) {
        String str = "shaik siddaiah";

        Map<Character,Integer>m = new HashMap<>();

        for (int i=0; i<str.length(); i++){

            if (m.containsKey(str.charAt(i))){

                m.put(str.charAt(i),m.get(str.charAt(i)) +1);

            }else{
                m.put(str.charAt(i),1);

            }
        }
        System.out.println(m);
    }
}
