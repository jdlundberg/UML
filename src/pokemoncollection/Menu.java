package pokemoncollection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Architect
 */
public class Menu {
    
    String command;
    ArrayList<String> pokedexList = new ArrayList<String>();
    ArrayList<String> myPokemonCollection = new ArrayList<String>();
    
    Controller controller = new Controller();
    
    public Menu() {
        
        pokedexList.add("001 Bulbasaur");
        pokedexList.add("002 Ivysaur");
        pokedexList.add("003 Venusaur");
        pokedexList.add("004 Charmander");
        pokedexList.add("005 Charmeleon");
        pokedexList.add("006 Charizard");
        pokedexList.add("007 Squirtle");
        pokedexList.add("008 Wartortle");
        pokedexList.add("009 Blastoise");
        
    }
    
    public void mainMenu() {
        
        Scanner selection = new Scanner(System.in);
        Integer mainMenuSelection;
        
        System.out.println("\nMain Menu");
        System.out.println("\t1. View Pokedex List");
        System.out.println("\t2. Add Pokemon to My Collection");
        System.out.println("\t3. Remove Pokemon from My Collection");
        System.out.println("\t4. View My Pokemon Collection");
        System.out.println("\t5. End Program");
        
        mainMenuSelection = selection.nextInt();
        
        switch (mainMenuSelection) {
            
            case 1: listPokedex();
                    mainMenu();
                break;
            case 2: addPokemonMenu();
                    mainMenu();
                break;
            case 3: removePokemonMenu();
                    mainMenu();
                break;
            case 4: listPokemonCollection();
                    mainMenu();
                break;
            case 5: System.exit(0);
        }
        
    }
    
    public void listPokedex() {
        
        command = "List Pokedex Entries";
        controller.handle(command, pokedexList);
        
    }
    
    public void addPokemonMenu() {
        
        Scanner selection = new Scanner(System.in);
        Integer addPokemonMenuSelection = null;
        
        listPokedex();
        
        System.out.println("\nWhich pokemon would you like to add to your list?");
        
        addPokemonMenuSelection = selection.nextInt();
        
        command = "Add Pokemon";
        controller.handle(command, addPokemonMenuSelection, pokedexList, myPokemonCollection);
        
    }
    
    public void removePokemonMenu() {
        
        Scanner selection = new Scanner(System.in);
        Integer removePokemonMenuSelection = null;
        
        listPokemonCollection();
        
        System.out.println("\nPlease select the slot number of the Pokemon you would like to remove from your collection.");
        
        try {
        
            removePokemonMenuSelection = selection.nextInt();
        
        }
        
        catch (Exception e) {
            
            if (removePokemonMenuSelection < 0 || removePokemonMenuSelection > myPokemonCollection.size()) {
                
                System.err.println("Invalid input.  Please choose between 0 and " + myPokemonCollection.size());
                
            }
            
        }
        
        command = "Remove Pokemon";
        controller.handle(command, removePokemonMenuSelection, myPokemonCollection);
            
    }
    
    public void listPokemonCollection() {
        
        command = "List Pokemon Collection";
        controller.handle(command, myPokemonCollection);
        
    }
    
}
