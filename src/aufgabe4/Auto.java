package aufgabe4;

/**
 *
 * @author benjamindeutinger
 */
public class Auto extends Fahrzeug implements Comparable{
    private boolean klimaanlage;
    private short airbags;
        
    public Auto(short reifen, String farbe, short ps, short tueren, short airbags) {
        super(reifen, farbe, ps, tueren);
        this.klimaanlage = false;
        this.airbags = airbags;
        anzahl++;
    }

//Overrides---------------------------------------------------------------------
    
    @Override
    public int compareTo(Object o){
        if (this.getPs() == ((Auto) o).getPs())
            return 0;
        else if ((this.getPs()) > ((Auto) o).getPs())
            return 1;
        else
            return -1;
    }
    
    @Override
    public String toString() {
        return "Mein Auto hat " + this.getPs() + " PS und fährt mit " + 
                this.getGeschwindigkeit() + " km/h" ;
    }

//------------------------------------------------------------------------------    
    
    public void klimaanlageAn(){
        if(this.klimaanlage==true){
            System.out.println("Klimaanlage läuft bereits!");
        }else{
            this.klimaanlage = true;
        }
    }
    
    public void klimaanlageAus(){
        if(this.klimaanlage==false){
            System.out.println("Klimaanlage ist bereits ausgeschaltet!");
        }else{
            this.klimaanlage = false;
        }
    }   

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    } 
}
