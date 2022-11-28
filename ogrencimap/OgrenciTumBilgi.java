package ogrencimap;

import java.util.HashMap;
import java.util.Map;

public class OgrenciTumBilgi {
    public static void main(String[] args) {
        Map<OgrenciBilgiMap,OgrenciNotMap> ogrTumBilgiMap=
                new HashMap<>();


        OgrenciNotMap ogrNotMap=new OgrenciNotMap();

        OgrenciNot ogrnot=new OgrenciNot(90,80,95);
        ogrNotMap.ogrNotmap.put(101,ogrnot);


        OgrenciBilgiMap ogrBilgiMap=new OgrenciBilgiMap();

        Ogrenci ogrx=new Ogrenci("Ali","şen","dev");
        ogrBilgiMap.ogrBilgimap.put(101,ogrx);

        ogrTumBilgiMap.put(ogrBilgiMap,ogrNotMap);
        System.out.println(ogrTumBilgiMap);


    }
}
