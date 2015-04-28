package aufgabe5;

/**
 *
 * @author benjamindeutinger
 */
public class Auto extends Fahrzeug{
    
    private boolean klimaanlage;
    private short airbags;
    private Color col;

    public Auto(short reifen, Color color, short ps, short tueren, short airbags) {
        super(reifen, ps, tueren);
        this.klimaanlage = false;
        this.airbags = airbags;
        this.col = color;
        anzahl++;
    }
    
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

    @Override
    public String toString() {
        return "Mein Auto hat " + this.getPs() + " PS und fährt mit " + 
                this.getGeschwindigkeit() + " km/h." + " Farbe: " + col;
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
    
    public void setColor(Color color){
        this.col = color;
    }
    
    public Color setColor(){
        return this.col;
    }
}
