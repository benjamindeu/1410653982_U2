package aufgabe2;

/**
 *
 * @author benjamindeutinger
 */
public class Mensch extends Saeugetier{

    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }
    
    @Override
    public String printAll(){
        return name+"#"+alter+"#"+geschlecht;
    }
}
