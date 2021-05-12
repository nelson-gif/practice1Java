package reportInteraction;

import report.*;

public class RepIntImplementation implements IReportInteraction{

    private IReport history;
    
    
    public RepIntImplementation(){
        history = new HistoryImpl();
    }
    
    @Override
    public void registerOfGames(String player1, String pokemon1Player1,
            String pokemon2Player1, String player2,String pokemon1Player2, String pokemon2Player2,
            int numberFightPlayer1, int numberFightPlayer2, String winner) {
        try{
            history.gameRegistration(player1, pokemon1Player1, pokemon2Player1, player2, pokemon1Player2, pokemon2Player2, numberFightPlayer1, numberFightPlayer2, winner);
        }catch(Exception e){
            System.out.println("It ocurred the next error when It was registering the game: "+e);
        }
    }
    
    @Override
    public void listRegister(){
        int length = history.histories().length;
        for (int i = 0; i < length; i++) {
            if (history.histories()[i] != null) {
                System.out.println("history.histories[i] = " + history.histories()[i]);
            }else{
                break;
            }
        }
    }

    @Override
    public void listMostUsedPokemons() {
        int large = history.arrayOrderedWithPokemonsAndCounter().length;
        for (int i = (large-1); i > large/2; i--) {
            if (history.arrayOrderedWithPokemonsAndCounter()[i] != null) {
                System.out.println("*************************************");
                System.out.println("The most used pokemons are: ");
                System.out.println("pokemon = " + history.arrayOrderedWithPokemonsAndCounter()[i]);
                System.out.println("*************************************");
            }
            else{
                break;
            }
        }
    }

    @Override
    public void listLessUsedPokemons() {
        int large = history.arrayOrderedWithPokemonsAndCounter().length;
        for (int i = 0; i < large/2; i++) {
            if (history.arrayOrderedWithPokemonsAndCounter()[i] != null) {
                System.out.println("*************************************");
                System.out.println("The less used pokemons are: ");
                System.out.println("pokemon = " + history.arrayOrderedWithPokemonsAndCounter()[i]);
                System.out.println("*************************************");
            }else{
                break;
            }
        }
    }
    
}
