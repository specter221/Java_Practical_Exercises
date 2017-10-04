import java.util.*;
import java.time.*;
import java.text.*;

public class pe2 {

public static void main(String []args){
      Calendar c = Calendar.getInstance();

     c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);

        System.out.println();
       DateFormat df = new SimpleDateFormat("E dd/MM/yyyy");
       System.out.println(df.format(c.getTime()));
        c.add(Calendar.DATE, 6);
        System.out.println(df.format(c.getTime()));
		System.out.println();
     }
}