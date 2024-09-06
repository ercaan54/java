
public class Kız  {
    String isim;
    private int yas;
    private String spor;

    public Kız(String isim, int yas, String spor) {
        this.isim = isim;
        this.yas = yas;
        this.spor = spor;
    }

    
    
    public void antremana_cık(){
        
        System.out.println( isim +" isimli sporcu şuan koşuya çıkıyor");
       
    }
    
    
    
     public void harekete_gec (int hız){
         System.out.println("sporcular " + hız + " ile hareket ediyor...");
         
     }
    
        
    public void yemek_ye(){
        System.out.println(isim + " ' li oyuncu yemeğe çıktı");
        
        
    }
    public void kos(int hız){
        System.out.println(  isim + "köpek koşuyor");
        harekete_gec(hız);
    }
    
    public void goz_rengi(){
        
        
        System.out.println(isim + " li oyuncunun" + goz_rengi);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the yas
     */
    public int getYas() {
        return yas;
    }

    /**
     * @param yas the yas to set
     */
    public void setYas(int yas) {
        this.yas = yas;
    }

    /**
     * @return the spor
     */
    public String getSpor() {
        return spor;
    }

    /**
     * @param spor the spor to set
     */
    public void setSpor(String spor) {
        this.spor = spor;
    }
    
    
}
