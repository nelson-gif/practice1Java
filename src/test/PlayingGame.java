package test;

import gameInteraction.GameImpl;
import gameInteraction.IGame;
import java.util.Scanner;
import report.IReport;
import reportInteraction.IReportInteraction;
import reportInteraction.RepIntImplementation;

public class PlayingGame {
    public static void main(String[] args) {
        IGame gameImplementation = new GameImpl();
        IReportInteraction history = new RepIntImplementation();
        principalMenu(gameImplementation, history);
    }
    
    public static void principalMenu(IGame gameImplementation, IReportInteraction history){
        System.out.println("***************************************************");
        System.out.println("Welcome to the main Menu, Select an option, please");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. enter as an admin");
        System.out.println("2. play with 2 players");
        System.out.println("3. Exit");
        int answer = Integer.parseInt(sc.nextLine());
        switch(answer){
            case 1:
                System.out.println("Enter your password: ");
                String password = sc.nextLine();
                if (password.equals("2")) {
                    admin(gameImplementation, history);
                }else{
                    System.out.println("Incorrect Password!!");
                    principalMenu(gameImplementation, history);
                }
                break;
            case 2:
                System.out.println("playing!!");
                System.out.println("Insert the name of the first player");
                String player1 = sc.nextLine();
                System.out.println("choose one of these pokemons");
                gameImplementation.showPokemon();
                String pokemon1Player1 = sc.nextLine();
                System.out.println("choose another pokemon");
                gameImplementation.showPokemon();
                String pokemon2Player1 = sc.nextLine();
                System.out.println("Insert the name of the second player");
                String player2 = sc.nextLine();
                System.out.println("choose one of these pokemons");
                gameImplementation.showPokemon();
                String pokemon1Player2 = sc.nextLine();
                System.out.println("choose another pokemon");
                gameImplementation.showPokemon();
                String pokemon2Player2 = sc.nextLine();
                
                int numberFightPlayer1 = 0;
                int random = (int) (Math.random()*2);
                if (random==1) {
                    System.out.println("It is turn of "+player1+" to attack");
                    System.out.println("Insert the name of the pokemon to atack: ");
                    String attackTo = sc.nextLine();
                    System.out.println("Insert the name of the pokemon to use: ");
                    String use = sc.nextLine();
                    gameImplementation.attack(attackTo, use);
                    numberFightPlayer1 +=1;
                }
                boolean alive;
                int turn = 2;
                String winner = "";
                int numberFightPlayer2 = 0;
                do{
                    alive = false;
                    if ((turn % 2) == 0) {
                        System.out.println("It is turn of "+player2 +" to attack");
                        turn =+ 1;
                        numberFightPlayer1 += 1;
                    }else{
                        System.out.println("It is turn of "+player1 +" to attack");
                        numberFightPlayer2 += 1;
                        turn =+ 1;
                    }
                    System.out.println("Insert the name of the pokemon to atack: ");
                    String attackTo = sc.nextLine();
                    System.out.println("Insert the name of the pokemon to use: ");
                    String use = sc.nextLine();
                    gameImplementation.attack(attackTo, use);
                    if (gameImplementation.alive(pokemon1Player1) == false && gameImplementation.alive(pokemon2Player1) == false) {
                        winner = player2;
                        System.out.println("The winner is "+winner);
                        alive = true;
                    }else if(gameImplementation.alive(pokemon1Player2) == false && gameImplementation.alive(pokemon2Player2) == false){
                        winner = player1;
                        System.out.println("The winner is "+winner);
                        alive = true;
                    }else{
                        alive = false;
                    }
                    
                }while(alive == false);
                
                history.registerOfGames(player1, pokemon1Player1, pokemon2Player1, player2, pokemon1Player2, pokemon2Player2, numberFightPlayer1, numberFightPlayer2, winner);
                principalMenu(gameImplementation, history);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Enter a correct option please.");
                break;
        }
        System.out.println("***************************************************");
    }
    
    public static void admin(IGame gameImplementation, IReportInteraction history){
        
        System.out.println("************************************************");
        System.out.println("Welcome again Nelson!! choose an option please: \n"
                + "1. Pokemon's list\n"
                + "2. Add a Pokemon\n"
                + "3. Edit a Pokemon\n"
                + "4. Reports\n"
                + "5. Go back to principal menu");
        Scanner sc = new Scanner(System.in);
        int answer = Integer.parseInt(sc.nextLine());
        switch(answer){
            case 1:
                gameImplementation.showPokemon();
                admin(gameImplementation, history);
                break;
            case 2:
                System.out.println("Enter the figure: ");
                String figure = sc.nextLine();
                System.out.println("Enter the name: ");
                String name = sc.nextLine();
                gameImplementation.addPokemon(figure, name);
                admin(gameImplementation, history);
                break;
            case 3:
                System.out.println("What pokemon do you want to edit?");
                String nameExisted = sc.nextLine();
                System.out.println("Enter the new figure: ");
                String figure2 = sc.nextLine();
                System.out.println("Enter the new Name");
                String name2 = sc.nextLine();
                gameImplementation.editPokemon(figure2, nameExisted, name2);
                admin(gameImplementation, history);
                break;
            case 4:
                report(gameImplementation, history, sc);
            case 5: 
                principalMenu(gameImplementation, history);
                break;
            default:
                System.out.println("Enter a correct option");
                break;
        }
        
    }
    
    public static void report(IGame gameImplementation, IReportInteraction history, Scanner sc){
        
        System.out.println("*******************************************************");
                System.out.println("Select one option: \n"
                        + "1. Register's game\n"
                        + "2. Most used Pokemons\n"
                        + "3. less used Pokemons\n"
                        + "4. return to admin");
                int option = Integer.parseInt(sc.nextLine());
                switch(option){
                    case 1:
                        history.listRegister();
                        report(gameImplementation, history, sc);
                        break;
                    case 2:
                        history.listMostUsedPokemons();
                        report(gameImplementation, history, sc);
                        break;
                    case 3:
                        history.listLessUsedPokemons();
                        report(gameImplementation, history, sc);
                        break;
                    case 4:
                        admin(gameImplementation, history);
                        break;
                    default:
                        System.out.println("Please, insert a correct option");
                        break;
                }
                System.out.println("*******************************************************");
    }
    
}
