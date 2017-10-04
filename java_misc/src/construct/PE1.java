package construct;
import java.io.*;

class Dog
{

      Dog()
    {
       System.out.println("I am Lucifer");
    }
}
class Cat{

    String name;

    Cat(String name)
    {
        this.name=name;
    }
}
class PE1
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        Cat cat1= new Cat("Tom");
        System.out.println(cat1.name);
        System.out.println("The theory of everything");

    }
}
