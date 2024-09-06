
public  abstract class Ciftlik {
    private String isim;
    private int boynuz;
    private String kuyruk;

    public Ciftlik(String isim, int boynuz, String kuyruk) {
        this.isim = isim;
        this.boynuz = boynuz;
        this.kuyruk = kuyruk;
    }
   
    
    
    
    public void ismini_soyle(){
        System.out.println("bu hayvanın ismi " + getIsim());
        
        
        
    }
    
    abstract void hayvan_ozellik();
        public void boynuz_sayısı(){
            
            System.out.println("bu hayvanın boynuz sayısı" + getBoynuz());
            
            
        }
     public void kuyruk_ozelligi(){
         
         System.out.println("bu hayvanın kuyruk özelliği şöyler : " + getKuyruk());
         
         
     }   
    abstract void hayvan_ozelligibastır();  
    
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
     * @return the boynuz
     */
    public int getBoynuz() {
        return boynuz;
    }

    /**
     * @param boynuz the boynuz to set
     */
    public void setBoynuz(int boynuz) {
        this.boynuz = boynuz;
    }

    /**
     * @return the kuyruk
     */
    public String getKuyruk() {
        return kuyruk;
    }

    /**
     * @param kuyruk the kuyruk to set
     */
    public void setKuyruk(String kuyruk) {
        this.kuyruk = kuyruk;
    }

   

}
