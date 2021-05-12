package domain;

public class History {
    private int numberOfFight;
    private String player1;
    private String pokemon1Player1;
    private String pokemon2Player1;
    private String player2;
    private String pokemon1Player2;
    private String pokemon2Player2;
    private int numberFightPlayer1;
    private int numberFightPlayer2;
    private String winner;

    public History(int numberOfFight, String player1, String pokemon1Player1, 
            String pokemon2Player1, String player2, String pokemon1Player2, 
            String pokemon2Player2, int numberFightPlayer1, int numberFightPlayer2, String winner) {
        this.numberOfFight = numberOfFight;
        this.player1 = player1;
        this.pokemon1Player1 = pokemon1Player1;
        this.pokemon2Player1 = pokemon2Player1;
        this.player2 = player2;
        this.pokemon1Player2 = pokemon1Player2;
        this.pokemon2Player2 = pokemon2Player2;
        this.numberFightPlayer1 = numberFightPlayer1;
        this.numberFightPlayer2 = numberFightPlayer2;
        this.winner = winner;
    }

    public int getNumberOfFight() {
        return numberOfFight;
    }

    public void setNumberOfFight(int numberOfFight) {
        this.numberOfFight = numberOfFight;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPokemon1Player1() {
        return pokemon1Player1;
    }

    public void setPokemon1Player1(String pokemon1Player1) {
        this.pokemon1Player1 = pokemon1Player1;
    }

    public String getPokemon2Player1() {
        return pokemon2Player1;
    }

    public void setPokemon2Player1(String pokemon2Player1) {
        this.pokemon2Player1 = pokemon2Player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getPokemon1Player2() {
        return pokemon1Player2;
    }

    public void setPokemon1Player2(String pokemon1Player2) {
        this.pokemon1Player2 = pokemon1Player2;
    }

    public String getPokemon2Player2() {
        return pokemon2Player2;
    }

    public void setPokemon2Player2(String pokemon2Player2) {
        this.pokemon2Player2 = pokemon2Player2;
    }

    public int getNumberFightPlayer1() {
        return numberFightPlayer1;
    }

    public void setNumberFightPlayer1(int numberFightPlayer1) {
        this.numberFightPlayer1 = numberFightPlayer1;
    }

    public int getNumberFightPlayer2() {
        return numberFightPlayer2;
    }

    public void setNumberFightPlayer2(int numberFightPlayer2) {
        this.numberFightPlayer2 = numberFightPlayer2;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("History{numberOfFight=").append(numberOfFight);
        sb.append(", player1=").append(player1);
        sb.append(", pokemon1Player1=").append(pokemon1Player1);
        sb.append(", pokemon2Player1=").append(pokemon2Player1);
        sb.append(", player2=").append(player2);
        sb.append(", pokemon1Player2=").append(pokemon1Player2);
        sb.append(", pokemon2Player2=").append(pokemon2Player2);
        sb.append(", numberFightPlayer1=").append(numberFightPlayer1);
        sb.append(", numberFightPlayer2=").append(numberFightPlayer2);
        sb.append(", winner=").append(winner);
        sb.append('}');
        return sb.toString();
    }

    
    
}
