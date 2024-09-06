class Futbolcu {
       public String  kos (){
       
       return   " futbolcu koşuyor ";
   }
       private String isim;

    public Futbolcu(String isim) {
        this.isim = isim;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
}
class Ahmet extends Futbolcu{

    public Ahmet(String isim) {
        super(isim);
    }
    @Override
    public String kos() {
        return this.getIsim() + " hızlı koşuyor"; 
    }
}
class Necip extends Futbolcu{

    public Necip(String isim) {
        super(isim);w
    }

    @Override
    public String kos() {
        return this.getIsim() + " koşarken sakatlandı"; 
    }
}
public class NewMain {
    public static void main(String[] args) {
       
        Futbolcu futbol1 = new Ahmet("ahmet");
        System.out.println(futbol1.kos());
        Futbolcu futbol2 = new Necip("necip");
        System.out.println(futbol2.kos());
    }  
}
