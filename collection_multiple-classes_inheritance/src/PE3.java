import java.util.HashMap;



public class PE3 {

        public static void main(String args[]) {


            String arr[] = {"a","b","c","d","a","c","c"};



            HashMap<String, Boolean> map = new HashMap<>();

            for (String t : arr) {
                if (map.containsKey(t))
                {
                    map.put(t,true);
                }
                else
                {
                    map.put(t,false);
                }

            }
            System.out.println(map);

        }
    }




