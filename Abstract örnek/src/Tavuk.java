
public class Tavuk  extends Ciftlik{
   
      private int kanat;

    public Tavuk(int kanat, String isim, int boynuz, String kuyruk) {
        super(isim, boynuz, kuyruk);
        this.kanat = kanat;
    }

   



    @Override
    void hayvan_ozellik() {
        System.out.println( kanat + "kanatlı bir hayvandır");

    }

    /**
     * @return the kanat
     */
    public int getKanat() {
        return kanat;
    }

    /**
     * @param kanat the kanat to set
     */
    public void setKanat(int kanat) {
        this.kanat = kanat;
    }

    @Override
    void hayvan_ozelligibastır() {
        
    }
    
}
