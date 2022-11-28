package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Soru5 {

    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(13);
        myList.add(56);
        myList.add(23);
        myList.add(45);
        myList.add(14);
        myList.add(40);

        Scanner input = new Scanner(System.in);
        System.out.println("Artırmak istediğiniz eleman sayısını giriniz ");
        int sayi = input.nextInt();

        ListIterator<Integer> myItr = myList.listIterator();
         while (myItr.hasNext()){
             Integer el = myItr.next();
             if (myItr.nextIndex()<=sayi){
             myItr.set(el+5);
         }

    }
        System.out.println(myList);
    }
}
