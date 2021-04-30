package gameInteraction;

import data.*;
import domain.Pokemon;

public class GameImpl implements IGame {
    private final IAccessData data;

    public GameImpl() {
        this.data = new AccessDataImpl();
    }

    @Override
    public void showPokemon() {
        this.data.listPokemon();
    }

    @Override
    public void addPokemon(String figure, String name) {
        if (this.data.exist(name)) {
            System.out.println("Pokemon already exist, please "
                    + "insert other name");
        } else {
            this.data.addPokemon(figure, name);

        }
    }

    @Override
    public void editPokemon(String figure, String nameExisted, String nameToEdit) {
        if (this.data.exist(nameExisted)) {
            this.data.editPokemon(figure, nameToEdit);
        } else {
            System.out.println("Pokemon doesn't exist, please"
                    + "insert a valid name.");
        }
    }

    @Override
    public void attack(String pokemonToAttack, String pokemonToUse) {
        if (this.data.alive(pokemonToUse) && this.data.exist(pokemonToUse)) {
            if (this.data.alive(pokemonToAttack) && this.data.exist(pokemonToAttack)) {
                this.data.batallar(pokemonToAttack, pokemonToUse);
                System.out.println("this pokemon = " + pokemonToAttack
                        + " has been attacked succesfully");
                System.out.println("the life of the pokemon "+pokemonToAttack +"is "+this.data.getLife(pokemonToAttack));
            } else {
                System.out.println("You cannot attack this pokemon: " + pokemonToAttack
                        + " because this"
                        + " pokemon is died or doesn't exist");
            }
        } else {
            System.out.println("You cannot use this pokemon: " + pokemonToUse
                    + " to attack because this"
                    + " pokemon is died or doesn't exist");
        }
    }

    @Override
    public void history() {
    }
    
    @Override
    public void players(String player1, String pokemon1Player1, String pokemon2Player1, String name2, String pokemon1Player2, String pokemon2Player2){
        
    }
    
    @Override
    public boolean alive(String pokemon){
        return this.data.alive(pokemon);
    }

}
