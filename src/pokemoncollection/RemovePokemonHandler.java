package pokemoncollection;

import java.util.ArrayList;

/**
 *
 * @author Architect
 */
public class RemovePokemonHandler implements Handler {
    
    @Override
    public void handleIt(Object... objects) {
        
        Integer position = (Integer)objects[0];
        ArrayList<String> myPokemonCollection = (ArrayList<String>)objects[1];
        
        String pokemonName = myPokemonCollection.get(position);
        
        myPokemonCollection.remove(myPokemonCollection.get(position));
        
        System.out.println("\n" + pokemonName + " has been removed from your Pokemon collection!");
        
    }
    
}
