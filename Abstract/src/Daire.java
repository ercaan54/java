
public class Daire  extends Sekil{
         
    private int yarıcap;
    
    
    public Daire(String isim) {
        super(isim);
       
    }

    public Daire(int yarıcap, String isim) {
        super(isim);
        this.yarıcap = yarıcap;
    }

    @Override
    void alan_hesapla() {
       System.out.println(getIsim() + "alanı "  + (Math.PI * yarıcap * yarıcap));
    }
    
     
}
 