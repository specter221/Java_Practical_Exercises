public class Outer {

    public class Inner{

        Inner(){
            System.out.println("I am from Inner");
        }
    }
        Outer(){
            System.out.println("I am from Outer");
    }

    Inner ItsInner()
    {
        return new Inner();
    }

    public static void main(String[] args) {

        Outer out = new Outer();
        Inner in;
        in = out.ItsInner();

    }






}
