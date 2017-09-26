import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maintest {
    public static void main(String[] args) {
        pe4 s1 = new pe4();
        pe4 s2 = new pe4();
        pe4 s3 = new pe4();
        pe4 s4 = new pe4();
        pe4 s5 = new pe4();

        s1.setid(1);
        s2.setid(2);
        s3.setid(3);
        s4.setid(4);
        s5.setid(5);

        s1.setname("a");
        s2.setname("b");
        s3.setname("c");
        s4.setname("d");
        s5.setname("e");

        s1.setage(21);
        s2.setage(23);
        s3.setage(22);
        s4.setage(19);
        s5.setage(20);

        ArrayList<pe4> arr = new ArrayList<pe4>();

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        Collections.sort(arr,new StudentsSorter());

        for(pe4 s: arr) {
            System.out.println(s.getname());
            System.out.println(s.getid());
            System.out.println(s.getage());
        }

    }

}





