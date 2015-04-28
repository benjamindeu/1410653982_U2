package aufgabe4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author benjamindeutinger
 */
public class Aufruf {
    
    public static void main(String args[]){
        ArrayList<Auto> liste = new ArrayList<>();
        Auto bmw = new Auto((short) 4, "silber", (short) 220, (short) 5, (short) 4);
        Auto audi = new Auto((short) 4, "schwarz", (short) 180, (short) 5, (short) 8);
        Auto audi2 = new Auto((short) 4, "weiß", (short) 300, (short) 5, (short) 8);
        Auto audi3 = new Auto((short) 4, "rot", (short) 255, (short) 5, (short) 8);
        Auto audi4 = new Auto((short) 4, "blau", (short) 100, (short) 5, (short) 8);
        
        liste.add(bmw);
        liste.add(audi);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        
        Collections.sort(liste);
        
        for(Auto a:liste){
            System.out.println(a.toString());
        }
    }
}
