package pokemoncollection;

import java.util.ArrayList;

/**
 *
 * @author Architect
 */
public class ListPokedexHandler implements Handler {
    
    @Override
    public void handleIt(Object... objects) {
        
        ArrayList<String> pokedexList = (ArrayList<String>)objects[0];
        
        for (int i = 0; i < pokedexList.size(); i++) {
            
            System.out.println(pokedexList.get(i));
            
        }
        
    }
    
}
