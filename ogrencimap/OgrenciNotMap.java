package ogrencimap;

import java.util.HashMap;
import java.util.Map;

public class OgrenciNotMap {
   public Map<Integer,OgrenciNot> ogrNotmap=new HashMap<>();

    @Override
    public String toString() {
        return "ogrencimap.OgrenciNotMap{" +
                "ogrNotmap=" + ogrNotmap +
                '}';
    }

    public static void main(String[] args) {


        Map<Integer,OgrenciNot> ogrNotmap=new HashMap<>();



        OgrenciNot ogrnot=new OgrenciNot(90,80,95);
        ogrNotmap.put(101,ogrnot);
       System.out.println(ogrNotmap.get(102).not1);


       Ogrenci ogr = new Ogrenci();
        ogr.adi="ayşen";
        ogr.soyadi="şen";
        ogr.brans="qa";



    }
}
