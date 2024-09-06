
public class İnek extends Ciftlik{
    private int ayak;

    @Override
    void hayvan_ozelligibastır() {
        System.out.println("ayak sayısı : " + ayak  );
         System.out.println("isim : " + getIsim()  );
    }

   

    public İnek(int ayak, String isim, int boynuz, String kuyruk) {
        super(isim, boynuz, kuyruk);
        this.ayak = ayak;
    }

   

   

    @Override
    void hayvan_ozellik() {
        System.out.println( ayak + "ayaklı bir hayvandır");
    }

    /**
     * @return the ayak
     */
    public int getAyak() {
        return ayak;
    }

    /**
     * @param ayak the ayak to set
     */
    public void setAyak(int ayak) {
        this.ayak = ayak;
    }
    
}
