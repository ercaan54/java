
public class Kopek implements Ihayvanbilgisi  {
    private  String tırnak_sayısı;
    private  String ayak_sayısı;

   
    public Kopek(String tırnak_sayısı, String ayak_sayısı) {
        this.tırnak_sayısı = tırnak_sayısı;
        this.ayak_sayısı = ayak_sayısı;
        
    }
    
     @Override
    public void ayak_sayısı_sorma() {
        System.out.println("köpekte 4 adet ayak vardır");
    }

    @Override
    public void tırnak_sayısı_sorma() {
        System.out.println("köpekte 48 adet trınak vardır");
    }

    
    
    
}
