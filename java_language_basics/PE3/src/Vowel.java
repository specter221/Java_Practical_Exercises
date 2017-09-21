import java.util.Scanner;

public class Vowel {

//    public static void main(String[ ] arg)
//    {
//        int i=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a word : ");
//        char ch=sc.nextLine( ).charAt(0);
//        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
//        {
//            System.out.println("Entered character "+ch+" is  Vowel");
//        }
//        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
//            System.out.println("Entered character "+ch+" is Consonant");
//        else
//            System.out.println("Not an alphabet");
//    }


    public static void main(String[] args) {

        //String inString = new String("");
        System.out.print("Enter letter: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {


            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(str.charAt(i) + "is vowel");
                    break;

                default:
                    System.out.println(str.charAt(i) + "Consonant");

            }
        }
    }

}

