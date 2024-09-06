
public abstract class Sekil {
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    public void ismini_söyle(){
        
        System.out.println("bu obje " + getIsim() +" objesidir" );
    }
    abstract void alan_hesapla();

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
     
        
     
  

}
