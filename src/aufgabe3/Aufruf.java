package aufgabe3;

/**
 *
 * @author benjamindeutinger
 */
public class Aufruf {
    
    public static void main(String args[]){
        Mensch myself = new Mensch("Benjamin", "Deutinger", 21);
        myself.status();
        
        myself = new Student("1410653982", "Web Business & Technology", "Benjamin", "Deutinger", 21);
        myself.status();
    }
}
