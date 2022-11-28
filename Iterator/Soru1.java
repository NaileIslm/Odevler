package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Soru1 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> li1 = list.listIterator();

        while (li1.hasNext()){
               li1.next();
               li1.remove();
        }
        System.out.println(list);
    }
}
