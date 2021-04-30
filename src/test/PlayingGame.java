package test;

import data.*;
import gameInteraction.GameImpl;
import gameInteraction.IGame;
import java.util.Scanner;

public class PlayingGame {
    public static void main(String[] args) {
        IGame gameImplementation = new GameImpl();
        principalMenu(gameImplementation);
    }
    
    public static void principalMenu(IGame gameImplementation){
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
                    admin(gameImplementation);
                }else{
                    System.out.println("Incorrect Password!!");
                    principalMenu(gameImplementation);
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
                
                int random = (int) (Math.random()*2);
                if (random==1) {
                    System.out.println("It is turn of "+player1+" to attack");
                    System.out.println("Insert the name of the pokemon to atack: ");
                    String attackTo = sc.nextLine();
                    System.out.println("Insert the name of the pokemon to use: ");
                    String use = sc.nextLine();
                    gameImplementation.attack(attackTo, use);
                }
                boolean alive;
                do{
                    alive = false;
                    System.out.println("It is turn of to attack");
                    System.out.println("Insert the name of the pokemon to atack: ");
                    String attackTo = sc.nextLine();
                    System.out.println("Insert the name of the pokemon to use: ");
                    String use = sc.nextLine();
                    gameImplementation.attack(attackTo, use);
                    if (gameImplementation.alive(pokemon1Player1) == false && gameImplementation.alive(pokemon2Player1) == false) {
                        System.out.println("The winner is "+player2);
                        alive = true;
                    }else if(gameImplementation.alive(pokemon1Player2) == false && gameImplementation.alive(pokemon2Player2) == false){
                        System.out.println("The winner is "+player1);
                        alive = true;
                    }else{
                        alive = false;
                    }
                    
                }while(alive == false);
                
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Enter a correct option please.");
                break;
        }
        System.out.println("***************************************************");
    }
    
    public static void admin(IGame gameImplementation){
        
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
                admin(gameImplementation);
                break;
            case 2:
                System.out.println("Enter the figure: ");
                String figure = sc.nextLine();
                System.out.println("Enter the name: ");
                String name = sc.nextLine();
                gameImplementation.addPokemon(figure, name);
                admin(gameImplementation);
                break;
            case 3:
                System.out.println("What pokemon do you want to edit?");
                String nameExisted = sc.nextLine();
                System.out.println("Enter the new figure: ");
                String figure2 = sc.nextLine();
                System.out.println("Enter the new Name");
                String name2 = sc.nextLine();
                gameImplementation.editPokemon(figure2, nameExisted, name2);
                admin(gameImplementation);
                break;
            case 4:
                System.out.println("showing reports");
            case 5: 
                principalMenu(gameImplementation);
                break;
            default:
                System.out.println("Enter a correct option");
                break;
        }
        
    }
    
    
}
