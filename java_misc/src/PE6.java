import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class PE6 {

    public static void main(String[] args) {

        String text= "She sells seashells by the seashore";
        String patternString = "se";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : " + matcher.start() + " - " + matcher.end());
        }


    }


}
















