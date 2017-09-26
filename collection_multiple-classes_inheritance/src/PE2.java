import java.util.HashMap;


public class PE2 {

    public static void main(String args[]) {


        String value =  "one one -one___two,,three,one @three*one?two";
        String message = value.replaceAll("[^A-Za-z]+", " ");

        String[] item = message.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : item) {
            if (map.containsKey(t)) {
                map.put(t,map.get(t) + 1);

            }
            else
            {
                map.put(t, 1);
            }
        }
        System.out.println(map);

    }
}
