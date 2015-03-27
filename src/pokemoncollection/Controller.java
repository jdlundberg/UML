package pokemoncollection;

import java.util.HashMap;

/**
 *
 * @author Architect
 */
public class Controller {
    
    private HashMap<String, Handler> controlHash = new HashMap<String, Handler>();
    
    public Controller() {
        
        ListPokedexHandler listPokedexHandler = new ListPokedexHandler();
        controlHash.put("List Pokedex Entries", listPokedexHandler);
        
        AddPokemonHandler addPokemonHandler = new AddPokemonHandler();
        controlHash.put("Add Pokemon", addPokemonHandler);
        
        RemovePokemonHandler removePokemonHandler = new RemovePokemonHandler();
        controlHash.put("Remove Pokemon", removePokemonHandler);
        
        ListPokemonCollectionHandler listPokemonCollectionHandler = new ListPokemonCollectionHandler();
        controlHash.put("List Pokemon Collection", listPokemonCollectionHandler);
        
    }
    
    public void handle(String command, Object... objects) {
        
        Handler task = controlHash.get(command);
        
        task.handleIt(objects);
        
    }
    
}
