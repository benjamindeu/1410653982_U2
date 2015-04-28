package aufgabe5;

/**
 *
 * @author benjamindeutinger
 */
public class Aufruf {
    
    public static void main(String[] args) {
        Auto bmw = new Auto((short) 4, Color.black, (short) 220, (short) 5, (short) 4);
        Auto audi = new Auto((short) 4, Color.red, (short) 180, (short) 5, (short) 8);
        
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
    }
}
