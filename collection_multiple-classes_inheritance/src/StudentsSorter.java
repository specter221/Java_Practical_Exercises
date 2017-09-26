import java.util.Comparator;
import java.util.*;

public class StudentsSorter implements Comparator<pe4> {

    public int compare(pe4 s1,pe4 s2) {
        if(s1.getage()==s2.getage())
//           return 0;
        {
            if(s1.getname().equals(s2.getname()))
            {
                if(s1.getid()>s2.getid())
                    return 1;
                else
                    return -1;
            }

            return s1.getname().compareTo(s2.getname());
        }
        else if(s1.getage()>s2.getage())
            return 1;
        else
            return -1;
    }

}
