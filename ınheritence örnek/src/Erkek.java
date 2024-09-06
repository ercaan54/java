
public class Erkek  extends Kız{
       private String goz_rengi; 

    public Erkek(String goz_rengi, String isim, int yas, String spor) {
        super(isim, yas, spor);
        this.goz_rengi = goz_rengi;
    }
/*
    public void grup_antreman(int hız ){
        
        System.out.println("Sporcu Koşuyor");
        harekete_gec( hız);
        
        
     }*/

   
   
        
    /**
     * @return the goz_rengi
     */
    public String getGoz_rengi() {
        return goz_rengi;
    }

    /**
     * @param goz_rengi the goz_rengi to set
     */
    public void setGoz_rengi(String goz_rengi) {
        this.goz_rengi = goz_rengi;
    }
        
        
    public void goz_rengi(){
        
        
        System.out.println(isim + " li oyuncunun" + goz_rengi);
    }
        
    }
    
    
    
   

