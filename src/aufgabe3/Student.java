package aufgabe3;

/**
 *
 * @author benjamindeutinger
 */
public class Student extends Mensch{
    private String matrNr;
    private String studiengang;

    public Student(String matrNr, String studiengang, String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
        this.matrNr = matrNr;
        this.studiengang = studiengang;
    }
    
    public void status(){
        System.out.println("Der Student " + this.getVorname() + " " + this.getNachname()
        + " ist " + this.getAlter() + ", hat die MatrNr " + this.matrNr + " und "
                + "studiert im Studiengang " + this.studiengang);
    }
}
