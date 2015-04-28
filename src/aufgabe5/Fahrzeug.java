package aufgabe5;

/**
 *
 * @author benjamindeutinger
 */
public class Fahrzeug {
    private short reifen;
    //private String farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl; //diese Variable wird geteilt über alle Instanzen verwendet, da static

//Konstruktor-------------------------------------------------------------------

    public Fahrzeug(short reifen, short ps, short tueren){
        this.reifen = reifen;
        //this.farbe = farbe;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = false;
        this.geschwindigkeit = (short) 0;
        anzahl++;
    }

//Klassen spezifische Methoden--------------------------------------------------
    

    public void starten(){
        this.gestartet = true;
    }
    
    public void stoppen(){
        this.gestartet = false;
    }
    
    public void beschleunigen(short geschwindigkeit){
        if((this.gestartet==true)&&(this.geschwindigkeit + geschwindigkeit <250)){
            this.geschwindigkeit = (short) (this.geschwindigkeit + geschwindigkeit); //short muss immer gecastet werden
        }else{
            if(this.gestartet==false){
                System.out.println("Das Auto ist nicht gestartet!");
            }else if((this.gestartet==true)&&(this.geschwindigkeit + geschwindigkeit >250)){
                System.out.println("Das Auto würde durch die Beschleunigung schneller als 250 fahren!");
            }
        }
    }
                
    public void bremsen(short geschwindigkeit){
        if((this.gestartet==true)&&(this.geschwindigkeit - geschwindigkeit >0)){
            this.geschwindigkeit = (short) (this.geschwindigkeit - geschwindigkeit); 
        }else{
            if(this.gestartet==false){
                System.out.println("Das Auto ist nicht gestartet!");
            }else if((this.gestartet==true)&&(this.geschwindigkeit + geschwindigkeit <0)){
                System.out.println("Das Auto würde durch die Beschleunigung langsamer als 0 fahren!");
            }
        }
    }
    
//Getter------------------------------------------------------------------------

    public short getReifen() {
        return reifen;
    }

//    public String getFarbe() {
//        return farbe;
//    }

    public short getPs() {
        return ps;
    }

    public short getTueren() {
        return tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

//Setter------------------------------------------------------------------------

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

//    public void setFarbe(String farbe) {
//        this.farbe = farbe;
//    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }
}
