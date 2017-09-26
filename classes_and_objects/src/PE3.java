class member{
    String name;
    int age;
    int salary;
}
public class PE3 {
    public static void main(String[] args) {
        member m = new member();
        m.name = "Akshay";
        m.age = 23;
        m.salary = 1000;
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.salary);
    }
}