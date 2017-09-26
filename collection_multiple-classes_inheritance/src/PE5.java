import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PE5 {

//    public static void main(String[] args) {
//
//
//
//        ArrayList<String> val1 = new ArrayList<String>();
//        ArrayList<String> val2 = new ArrayList<String>();
//            Scanner sc = new Scanner(System.in);
//
//                System.out.println("val1: ");
//                val1.add(sc.next());
//                System.out.println("val2: ");
//                val2.add(sc.next());
//
//                val2=val1;
//                System.out.println("val2:"+val2);
//
//
//                if (val1 != null)
//                {
//                  val1.put("val1" , "");
//                }
//        }

        public static void print_map(HashMap<String, String> hm){
            for(Map.Entry<String , String> ent : hm.entrySet()){
                System.out.println(ent.getKey() + " : " + ent.getValue());
            }
        }
        public static void main(String args[] ) {

            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("val1", "java1");
            hm.put("val2", "java2");

            print_map(hm);

            String tmp;
            if(hm.get("val1") != null){
                tmp = hm.get("val1");
                hm.put("val1" , "");
                hm.put("val2", tmp);
            }
            print_map(hm);

        }
    }




