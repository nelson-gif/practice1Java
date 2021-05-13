package report;

import domain.AmountOfPokemons;
import domain.History;

public class HistoryImpl implements IReport {

    private History histories[];
    private String usedPokemons[];
    private AmountOfPokemons myObject;
    private AmountOfPokemons mostUsed[];
    private History history;
    private int counter;
    private int aux;
    public static int numberOfFights;

    public HistoryImpl() {
        histories = new History[20];
        counter = 0;
        numberOfFights = 1;
        usedPokemons = new String[50];
        aux = 0;
        mostUsed = new AmountOfPokemons[50];
    }

    @Override
    public void gameRegistration(String player1, String pokemon1Player1,
            String pokemon2Player1, String player2, String pokemon1Player2, String pokemon2Player2,
            int numberFightPlayer1, int numberFightPlayer2, String winner) {
        history = new History(HistoryImpl.numberOfFights, player1, pokemon1Player1, pokemon2Player1,
                player2, pokemon1Player2, pokemon2Player2, numberFightPlayer1,
                numberFightPlayer2, winner);
        histories[counter++] = history;
        HistoryImpl.numberOfFights += 1;
    }

    @Override
    public History[] histories() {
        return this.histories;
    }

    private String[] bubbleSort() {
        try{
            for (History elemento : histories) {
                /*it adds the pokemons to the string array usedPokemons*/
                if (elemento != null) {
                    usedPokemons[aux++] = elemento.getPokemon1Player1();
                    usedPokemons[aux++] = elemento.getPokemon1Player2();
                    usedPokemons[aux++] = elemento.getPokemon2Player1();
                    usedPokemons[aux++] = elemento.getPokemon2Player2();
                } else {
                    break;
                }
            }
        }catch(Exception e){
        }

        /*it uses the bubble sort to order the array */
//        for (String elemento : usedPokemons) {

            try {
                for (int i = 0; i < usedPokemons.length - 1; i++) {

                    for (int j = 0; j < usedPokemons.length - 1 - i; j++) {
                        if (usedPokemons[j] != null) {
                            if (usedPokemons[j + 1].compareTo(usedPokemons[j]) < 0) {
                                String auxi = usedPokemons[j];
                                usedPokemons[j] = usedPokemons[j + 1];
                                usedPokemons[j + 1] = auxi;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (Exception e) {

            }

//        }
        return usedPokemons;
    }

    @Override
    public AmountOfPokemons[] arrayOrderedWithPokemonsAndCounter() {
        int contador = 0;
        int contadorAux = 0;
        String auxiliar = bubbleSort()[0];
        /*it counts how many pokemons are repeated and create another array
        that contain pokemon, counter*/
        try{
            for (int i = 0; i < bubbleSort().length; i++) {
                if (bubbleSort()[i] != null) {
                    if (auxiliar.equals(bubbleSort()[i])) {
                        contador++;
                    } else {
                        myObject = new AmountOfPokemons(auxiliar, contador);
                        mostUsed[contadorAux++] = myObject;
                        //System.out.println("aux = " + auxiliar+" contador = "+contador);
                        contador = 1;
                        auxiliar = bubbleSort()[i];
                    }
                    if (i == bubbleSort().length - 1) {
        //                System.out.println("aux = " + auxiliar + " contador = "+contador);
                        myObject = new AmountOfPokemons(auxiliar, contador);
                        mostUsed[contadorAux++] = myObject;
                    }
                }else{
                    break;
                }
            }
        }catch(Exception e){
            
        }

        /*it uses the bubble sort to order the array type object that contains pokemons, counter
        , so It orders from the lowest to the highest*/
        
        try{
            for (int i = 0; i < mostUsed.length - 1; i++) {
                for (int j = 0; j < mostUsed.length - 1 - i; j++) {
                    /*ordena de menor a mayor*/
                    if (((Comparable) mostUsed[j + 1]).compareTo(mostUsed[j]) < 0) {
                        AmountOfPokemons objectAux = mostUsed[j];
                        mostUsed[j] = mostUsed[j + 1];
                        mostUsed[j + 1] = objectAux;
                    }
                }
            }
        }catch(Exception e){
            
        }
        
        return mostUsed;
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
