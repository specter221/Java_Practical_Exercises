import java.util.*;
import java.lang.*;

    class Student {
        private int id, age;
        private String name;

        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getid() {
            return this.id;
        }

        public void setid(int id) {

            this.id = id;
        }
        public int getage() {

            return this.age;
        }

        public void setage(int age) {
            this.age = age;
        }
    }
    class studentSorter implements Comparator<Student> {


        public int compare(Student d, Student d1) {

            int x1 = d1.getage() - d.getage();

            if (x1 == 0) {

                int x2 = (d.getName()).compareTo(d1.getName());

                if (x2 == 0)

                    return d.getid() - d1.getid();

                else

                    return x2;

            }

            return x1;

        }

    }

    public class PE4 {

        public static void main(String[] args) {

            List<Student> list = new ArrayList<Student>(5);

            Scanner scan = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {

                Student s = new Student();

                System.out.println("Enter name, id, age: ");

                s.setName(scan.nextLine());

                s.setid(scan.nextInt());

                s.setage(scan.nextInt());

                String s1 = scan.nextLine();

                list.add(s);



            }

            Collections.sort(list, new studentSorter());

            for (int i = 0; i < 3; i++)

                System.out.println(list.get(i).getid() + " " + list.get(i).getName() + " " + list.get(i).getage());

        }

    }





