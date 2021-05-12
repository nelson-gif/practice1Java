package report;

import domain.AmountOfPokemons;
import domain.History;

public interface IReport {
    
    void gameRegistration(String player1, String pokemon1Player1,
            String pokemon2Player1, String player2,String pokemon1Player2, String pokemon2Player2,
            int numberFightPlayer1, int numberFightPlayer2, String winner);
    
    AmountOfPokemons[] arrayOrderedWithPokemonsAndCounter();
    
    History[] histories();
    
    void playersWhoILost();
    
    void playersWhoIwin();
    
}
