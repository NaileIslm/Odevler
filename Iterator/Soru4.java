package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Soru4 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(13);
        myList.add(56);
        myList.add(23);
        myList.add(45);
        myList.add(14);
        myList.add(40);

        System.out.println(myList); //[2, 13, 56, 23, 45, 14, 40]

        ListIterator<Integer> myItr = myList.listIterator();
        while (myItr.hasNext()){
            myItr.next();
        }
        while (myItr.hasPrevious()){
            Integer el2 = myItr.previous();
            System.out.print(el2 + " ");
    }
    }
}
