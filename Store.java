/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Charm_MuyaPimentelTagorda_2ndQtrProjectDesign;
import java.util.ArrayList;
/**
 *
 * @author Fifi
 */
public class Store {
    protected String name;
    protected ArrayList<Deck> decks;
    protected ArrayList<PowerUps> powerUps;
    
    public Store(String n){
        this.name = n;
    }
    
    public void displayDecksToBuy(User u){
        System.out.println("You can buy any of the ff. decks: ");
        for(Deck d : Deck.allDecks){
            if(!u.getAccessibleDecks().contains(d))
                System.out.println(d.getName() + " for " + d.getCost() + " pts");
        }
    }
    
    public void displayPowerUpsToBuy(User u){
        System.out.println("You can buy any of the ff. power-ups: ");
        for(PowerUps p : PowerUps.allPowerUps){
            System.out.println(p.getName() + " for " + p.getCost() + " pts");
        }
    }
}
