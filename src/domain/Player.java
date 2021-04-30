package domain;

public class Player {
    private String name;
    private String pokemon1;
    private String pokemon2;
    
    public Player(){}
    
    public Player(String name, String pokemon1, String pokemon2){
        this.name = name;
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPokemon1() {
        return this.pokemon1;
    }

    public void setPokemon1(String pokemon1) {
        this.pokemon1 = pokemon1;
    }

    public String getPokemon2() {
        return this.pokemon2;
    }

    public void setPokemon2(String pokemon2) {
        this.pokemon2 = pokemon2;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", pokemon1=" + pokemon1 + ", pokemon2=" + pokemon2 + '}';
    }
    
    
}
