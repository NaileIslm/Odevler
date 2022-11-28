package ogrencimap;

public class Ogrenci {
   public String  adi;
   public String  soyadi;
   public String  brans;

    public Ogrenci(String adi, String soyadi, String brans) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.brans = brans;
    }

    public Ogrenci() {
    }

    @Override
    public String toString() {
        return "ogrencimap.Ogrenci{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", brans='" + brans + '\'' +
                '}';
    }
}
