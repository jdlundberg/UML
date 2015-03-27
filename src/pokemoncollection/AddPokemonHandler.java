package pokemoncollection;

import java.util.ArrayList;

/**
 *
 * @author Architect
 */
public class AddPokemonHandler implements Handler {
    
    @Override
    public void handleIt(Object... objects) {
        
        Menu menu = new Menu();
        
        Integer position = (Integer)objects[0] - 1;
        ArrayList<String> pokedexList = (ArrayList<String>)objects[1];
        ArrayList<String> myPokemonCollection = (ArrayList<String>)objects[2];
        
        if (position < 0 || position > pokedexList.size()) {
            
            System.err.println("Invalid selection.  Please select a number between 1 and " + pokedexList.size() + "\n");
            
            menu.addPokemonMenu();
            
        }
        
        else {
        
            myPokemonCollection.add(pokedexList.get(position));
        
            System.out.println("\n" + pokedexList.get(position) + " has been added to your collection!");
            
        }
        
    }
    
}
