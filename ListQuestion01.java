import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuestion01 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Oluşturmak istediğiniz List'in kaç elemanı var?");
        Integer listSize = input.nextInt();
        List<Integer> myList = new ArrayList<Integer>();


        for (Integer i = 0; i < listSize; i++) {
            System.out.println("Lütfen " + (i + 1) + ". elemanı giriniz");
            myList.add(input.nextInt());

        }
        System.out.println("Oluşturduğunuz List: " + myList);

        System.out.println("List'den eleman ve ya elemanlar silmek için R-ye, List'deki  herhangi bir elemanı güncellemek için U-ya basın");

        char option = input.next().toUpperCase().charAt(0);

        switch (option) {

            case 'R':
                System.out.println("List'den kaç adet eleman silmek istiyorsunuz?");
                Integer rmvEl = input.nextInt();

                try {
                    for (Integer j = 0; j < rmvEl; j++) {
                        System.out.println("Lütfen silmek istediğiniz " + (j + 1) + ". elemanı giriniz");
                        myList.remove(myList.indexOf(input.nextInt()));
                    }
                    System.out.println("Güncel List'iniz: " + myList);

                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Girmiş olduğunuz eleman ve ya elemanlar List'de mevcut değil");
                }
                break;

            case 'U':

                System.out.println("Lütfen güncellemek istediğiniz elemanı giriniz");
                Integer uptEl = input.nextInt();

                if (myList.contains(uptEl)) {
                    System.out.println(uptEl + " elemanını hangi değere güncellemek istiyorsunuz?");

                            myList.set(myList.indexOf(uptEl),input.nextInt());

                        } else {
                    System.out.println("Girdiğiniz eleman List'de mevcut değil");
                }

                    System.out.println("Güncel List'iniz: " + myList);
                    break;

                    default:
                System.out.println("Lütfen R ve ya U seçeneklerinden birini seçin");
                }
        }
}

