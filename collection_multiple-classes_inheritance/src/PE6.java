import java.util.*;

public class PE6 {

//    public static void main(String[] args) {
//
//        System.out.println("Names :" +readString());
//
//        SortedSet<String> name = new TreeSet<>();
//        System.out.println(readString());
//
//    }
//    private static String readString()
//    {
//        System.out.println("Enter the names");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        return name;
//    }

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();
        Set<String> s = new HashSet<>();
        s.add("Alice");
        s.add("Bluto");
        s.add("Eugene");
        s.add("Harry");
        s.add("Olive");
        System.out.println("Before Sorting");
        for (String s1 : s) {
            System.out.print("  " + s1);
        }
        System.out.printf("\n");

        System.out.println("After Sorting");
        al.addAll(s);
        Collections.sort(al);
        for (String set : al) {
            System.out.print(" " + set);
        }
    }
}




