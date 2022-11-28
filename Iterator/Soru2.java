package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru2 {

    //String bir listedeki tüm elemntlerin sonuna "X" ekleyin

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //1.Yol
        for (String w : list) {
            w = w + "X";
        }
        System.out.println(list);

        //2.Yol
        ListIterator<String> li1 = list.listIterator();
        while (li1.hasNext()) {
            String str = li1.next();
            li1.set(str + "X");
        }
        System.out.println(list);
    }
}