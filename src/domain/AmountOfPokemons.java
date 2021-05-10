package domain;

public class AmountOfPokemons {
    private String pokemon;
    private int amount;
    
    public AmountOfPokemons(){}
    
    public AmountOfPokemons(String pokemon, int amount){
        this.pokemon = pokemon;
        this.amount = amount;
    }

    public String getPokemon() {
        return this.pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AmountOfPokemons{" + "pokemon=" + pokemon + ", amount=" + amount + '}';
    }
    
    
}
