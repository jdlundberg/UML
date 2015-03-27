/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemoncollection;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Architect
 */
public class AddPokemonHandlerTest {
    
    public AddPokemonHandlerTest() {
    }

    /**
     * Test of handleIt method, of class AddPokemonHandler.
     */
    @Test
    public void testHandleIt() {
        System.out.println("Testing the handleIt method of the AddPokemonHandler class - Attempting to add Ivysaur to the collection");
        
        Integer position = 2;
        ArrayList<String> pokedexList = new ArrayList<String>();
        ArrayList<String> myPokemonCollection = new ArrayList<String>();
        
        pokedexList.add("001 Bulbasaur");
        pokedexList.add("002 Ivysaur");
        pokedexList.add("003 Venusaur");
        pokedexList.add("004 Charmander");
        pokedexList.add("005 Charmeleon");
        pokedexList.add("006 Charizard");
        pokedexList.add("007 Squirtle");
        pokedexList.add("008 Wartortle");
        pokedexList.add("009 Blastoise");
        
        Object[] objects = {position, pokedexList, myPokemonCollection};
        
        AddPokemonHandler instance = new AddPokemonHandler();
        instance.handleIt(objects);
        
        assertEquals("002 Ivysaur", myPokemonCollection.get(0));
    }
    
    @Test(expected=NoSuchElementException.class)
    public void testHandleIt2() {
        System.out.println("Testing the handleIt method of the AddPokemonHandler class - Attempting to add an invalid selection to the collection");
        
        Integer position = 12;
        ArrayList<String> pokedexList = new ArrayList<String>();
        ArrayList<String> myPokemonCollection = new ArrayList<String>();
        
        pokedexList.add("001 Bulbasaur");
        pokedexList.add("002 Ivysaur");
        pokedexList.add("003 Venusaur");
        pokedexList.add("004 Charmander");
        pokedexList.add("005 Charmeleon");
        pokedexList.add("006 Charizard");
        pokedexList.add("007 Squirtle");
        pokedexList.add("008 Wartortle");
        pokedexList.add("009 Blastoise");
        
        Object[] objects = {position, pokedexList, myPokemonCollection};
        
        AddPokemonHandler instance = new AddPokemonHandler();
        instance.handleIt(objects);
        
    }
    
    @Test(expected=NoSuchElementException.class)
    public void testHandleIt3() {
        System.out.println("Testing the handleIt method of the AddPokemonHandler class - Attempting to add an invalid selection to the collection (negative integer)");
        
        Integer position = -4;
        ArrayList<String> pokedexList = new ArrayList<String>();
        ArrayList<String> myPokemonCollection = new ArrayList<String>();
        
        pokedexList.add("001 Bulbasaur");
        pokedexList.add("002 Ivysaur");
        pokedexList.add("003 Venusaur");
        pokedexList.add("004 Charmander");
        pokedexList.add("005 Charmeleon");
        pokedexList.add("006 Charizard");
        pokedexList.add("007 Squirtle");
        pokedexList.add("008 Wartortle");
        pokedexList.add("009 Blastoise");
        
        Object[] objects = {position, pokedexList, myPokemonCollection};
        
        AddPokemonHandler instance = new AddPokemonHandler();
        instance.handleIt(objects);

    }
    
}
