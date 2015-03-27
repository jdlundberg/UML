package pokemoncollection;

import java.util.ArrayList;

/**
 *
 * @author Architect
 */
public class ListPokemonCollectionHandler implements Handler {
    
    @Override
    public void handleIt(Object... objects) {
        
        ArrayList<String> myPokemonCollection = (ArrayList<String>)objects[0];
        
        for (int i = 0; i < myPokemonCollection.size(); i++) {
            
            System.out.println("Slot # " + i + " - " + myPokemonCollection.get(i));
            
        }
        
    }
    
}
