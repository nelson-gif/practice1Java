package data;

import domain.Player;
import domain.Pokemon;

public class AccessDataImpl implements IAccessData{
    private int counter;
    private int counterArrayPlayer;
    private Pokemon[] pokemons;
    private Pokemon createPokemon; 
    private Player player;
    private Player[] players;
    
    public AccessDataImpl(){
        counter = 0;
        counterArrayPlayer = 0;
        pokemons = new Pokemon[20];
        players = new Player[50];
        player = new Player();
    }
    
    //It returns a random number between rangeA-rangeB
    private int randomNumber(int rangeA, int rangeB){
        int random = 0;
        do{
            random = (int)(Math.random()*100);
        }while(random <= rangeA || random >= rangeB);
        return random;
    }
    
    @Override
    public void addPokemon(String figure, String name) {
        int life = randomNumber(50, 100);
        int attack = randomNumber(5,20);
        createPokemon = new Pokemon(figure, name, life, attack);
        pokemons[counter] = createPokemon;
        counter++;
        System.out.println("Pokemon has been added succesfully");
    }
    
    //returns the position of the vector where is the recieve name
    private int position(String name){
        int position = -1;
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] != null) {
                //if it found the name in the vector, change the value of the variable 
                //for the value of the position of the vector
                if (pokemons[i].getName().equals(name)) {
                    position = i;
                }
            }else{
                break;
            }
        }
        return position;
    }
    
    //returns true if the vector exists 
    @Override
    public boolean exist(String name) {
        boolean exist = false;
        if (position(name) != -1) {
            exist = true;
        }
        return exist;
    }

    @Override
    public String editPokemon(String figure, String name) {
        createPokemon = new Pokemon(figure, name, createPokemon.getLife(), createPokemon.getAttack());
        pokemons[position(name)] = createPokemon;
        return "The pokemon has been updated succesfully";
    }
    
    //(pokemon that the user wants to attack, pokemon that the user wants to use to attack)
    @Override
    public void batallar(String pokemonToAttack, String pokemonToUse) {
        for(Pokemon elementToAttack: pokemons){
            if (elementToAttack == null) {
                break;
            }else{
            //if element.getName is equals to pokemonToAttack that means that now I am using the object where is located the pokemon
            //that I want to attack
            if (elementToAttack.getName().equals(pokemonToAttack)) {
                for(Pokemon elementToUse: pokemons){
                    /*
                        if elementToUse if equals to pokemonToUse that means that now I am using the object where is located the
                        pokemon that I want to use, at this point I would be using the object where is located the pokemon that
                        I want to attack and also the object that I want to use to attack
                    */
                    if (elementToUse.getName().equals(pokemonToUse)) {
                        //it does a rest to the pokemonToAttack's Life. life - attack
                        elementToAttack.setLife(elementToAttack.getLife()-elementToUse.getAttack());
                        break;
                    }
                }
            }
            }
        }
    }
    
    @Override
    public boolean alive(String pokemon){
        boolean variable = false;
        for(Pokemon element: pokemons){
            if (element != null) {
                if (element.getName().equals(pokemon)) {
                    if (element.getLife() >0) {
                        variable = true;
                    }
                    break;
                }
            }else{
                break;
            }
        }
        return variable;
    }

    @Override
    public int getLife(String pokemon){
        int score = -1;
        for(Pokemon element: pokemons){
            if (element == null) {
                break;
            }else{
            if (element.getName().equals(pokemon)) {
               score = element.getLife();
            }
            }
        }
        return score;
    }
    
    @Override
    public void listPokemon(){
        for (Pokemon temporal : pokemons) {
            if (temporal == null) {
                System.out.println("There is no any pokemon.");
                break;
            } else {
                System.out.println("******************************************************************************");
                System.out.println(temporal.getFigure() + "\n");
                System.out.println("Name: " + temporal.getName() + "\n");
                System.out.println("Life: " + temporal.getLife());
                System.out.println("Attack: " + temporal.getAttack() + "\n");
                System.out.println("******************************************************************************");
            }
        }
    }
    
    @Override
    public void players(String name, String pokemon1, String pokemon2){
        player = new Player(name, pokemon1, pokemon2);
        players[counterArrayPlayer++] = player;
    }
}
