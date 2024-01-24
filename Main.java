/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Charm_MuyaPimentelTagorda_2ndQtrProjectDesign;
import java.util.Scanner;
/**
 *
 * @author Fifi
 */
public class Main {
    public static void main(String[] args){
        //START Scenario 1
        Scanner scan = new Scanner(System.in);
        User generic = new User();
        User player1 = new User("theRedBaron","MSC@1994");
        
        //Multiple Cards are created
        Card e1 = new Card("Circuit known as the Temple of Speed", "Monza");
        Card e2 = new Card("Most number of World Driver's Championships won by 1 driver", "7");
        Card e3 = new Card("Team who won the Constructor's title from 2014 to 2020", "Mercedes");
        
        //Cards are compiled into Deck
        Deck easyLevel = new Deck("Easy Level", 0);
        easyLevel.addToDeck(e1);
        easyLevel.addToDeck(e2);
        easyLevel.addToDeck(e3);
        
        //User signs in to their account
        System.out.println("Input Y if playing with account, N if not.");
        
        String account = "Y";
        if(account.equals("Y")){
            System.out.println("Username: ");
            String inputUsername = "theRedBaron";
            System.out.println("Password: ");
            String inputPassword = "MSC@1994";
            generic.signIn(inputUsername, inputPassword);
        }
        
        //User picks Deck named Easy Level
        generic.displayDecks();
        System.out.println("You have picked the Easy Level deck.");
        
        //User answers all the questions in easyLevel
        int quesCounter = 0;
        while(quesCounter <= easyLevel.getDeckSize()){
            System.out.println(easyLevel.getCard(quesCounter).getQuestion());
            String userAnswer = scan.nextLine();
            player1.answer(easyLevel.getCard(quesCounter), userAnswer);
            quesCounter++;
        }

        //User's score is displayed
        System.out.println("You scored " + generic.getSessionPts() + " points!");
        
        //User signs out from their account
        generic.signOut();
        
        //END Scenario 1

        //START Scenario 2
        User generic = new User();
        User player2 = new User("cheescakeluvr","uniqlo100%");

        //Multiple Cards are created
        Card e13 = new Card("Circuit known as the Temple of Speed", "Monza");
        Card e23 = new Card("Most number of World Driver's Championships won by 1 driver", "7");
        Card e33 = new Card("Team who won the Constructor's title from 2014 to 2020", "Mercedes");

        //Cards are compiled into Deck
        Deck WDC = new Deck("WDC", 0);
        easyLevel.addToDeck(e1);
        easyLevel.addToDeck(e2);
        easyLevel.addToDeck(e3);

        //User answers all the Cards in WDC
        int quesCounter = 0;
        while(quesCounter <= WDC.getDeckSize()){
            System.out.println(WDC.getCard(quesCounter).getQuestion());
            String userAnswer = scan.nextLine();
            player2.answer(WDC.getCard(quesCounter), userAnswer);
            quesCounter++;
        }

        //User's score is displayed
        System.out.println("Score: " + player2.getSessionPts());
      
        //END Scenario 2

        //START Scenario 3
        User generic = new User();
        User player3 = new User("turtriela","galileo_BigScoop11");
        player3.careerPts = 100; // for example
      
        //Multiple Cards are created
        Card e13 = new Card("Circuit known as the Temple of Speed", "Monza");
        Card e23 = new Card("Most number of World Driver's Championships won by 1 driver", "7");
        Card e33 = new Card("Team who won the Constructor's title from 2014 to 2020", "Mercedes");

        //Cards are compiled into Deck
        Deck Tracks = new Deck("Tracks", 25);
        easyLevel.addToDeck(e1);
        easyLevel.addToDeck(e2);
        easyLevel.addToDeck(e3);

        //User signs in to their account
        System.out.println("Input Y if playing with account, N if not.");

        String account = "Y";
        if(account.equals("Y")){
            System.out.println("Username: ");
            String inputUsername = "herbadology";
            System.out.println("Password: ");
            String inputPassword = "galileo_BigScoop11";
            generic.signIn(inputUsername, inputPassword);
        }

      //User buys Deck named Tracks from Store
      player3.buy(Tracks);
      player3.buy(twoX, 5);

      //User’s accessible Decks, PowerUps stock, and careerPts are display
      player3.displayDecks();
      player3.displayPowerUps();
      System.out.println(player3.getCareerPts());

      //END Scenario 3
    }
}
