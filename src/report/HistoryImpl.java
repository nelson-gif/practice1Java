package report;

import domain.History;

public class HistoryImpl implements IReport{
    private History histories[];
    private History history;
    public static int numberOfFights;
    public HistoryImpl(){
        histories = new History[20];
    }

    @Override
    public void gameRegistration(String player1, String pokemon1Player1,
            String pokemon2Player1, String player2,String pokemon1Player2, String pokemon2Player2,
            int numberFightPlayer1, int numberFightPlayer2, int numberHitPokemon1Player1,
            int numberHitPokemon2Player1, int numberHitPokemon1Player2, 
            int numberHitPokemon2Player2, 
            String winner) {
        history = new History(numberOfFights, player1, pokemon1Player1, pokemon2Player1, 
                player2, pokemon1Player2, pokemon2Player2, numberFightPlayer1, 
                numberFightPlayer2, numberHitPokemon1Player1, numberHitPokemon2Player1, 
                numberHitPokemon1Player2, numberHitPokemon2Player2, winner);
        
    }

    @Override
    public void mostUsedPokemon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lessUsedPokemon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playersWhoILost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playersWhoIwin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
