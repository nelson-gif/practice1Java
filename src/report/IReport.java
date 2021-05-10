package report;

import domain.AmountOfPokemons;

public interface IReport {
    
    void gameRegistration(String player1, String pokemon1Player1,
            String pokemon2Player1, String player2,String pokemon1Player2, String pokemon2Player2,
            int numberFightPlayer1, int numberFightPlayer2, int numberHitPokemon1Player1,
            int numberHitPokemon2Player1, int numberHitPokemon1Player2, 
            int numberHitPokemon2Player2, 
            String winner);
    
    AmountOfPokemons[] arrayOrderedWithPokemonsAndCounter();
    
    void playersWhoILost();
    
    void playersWhoIwin();
    
}
