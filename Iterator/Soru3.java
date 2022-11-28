package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Soru3 {


    //Bir listede istenen sayı aralığında olmayan olmayan elemntleri silen kod yazın.
    //2. liste oluşturmadan mevcut liste üzerinde değişiklik yapın
    //Örnek liste: [2, 13, 56, 23, 45, 14, 40]  20 ile 40 arasında olan elementler dışındakileri sil(sınırlar dahil)


    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(13);
        myList.add(56);
        myList.add(23);
        myList.add(45);
        myList.add(14);
        myList.add(40);

        System.out.println(myList);

        Iterator<Integer> myItr = myList.iterator();

        while (myItr.hasNext()){
            Integer element = myItr.next();
            if (element<20 || element>40){
                myItr.remove();
            }
        }
        System.out.println(myList);
    }

}
