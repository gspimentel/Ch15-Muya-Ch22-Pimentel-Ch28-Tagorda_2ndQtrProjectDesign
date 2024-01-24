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
public class Deck {
    protected ArrayList<Card> cards;
    protected static ArrayList<Deck> allDecks, defaultDecks;
    protected String name;
    protected int deckPts, numLives, cost;

    public Deck(String n, int c){
        this.name = n;
        this.cost = c;
        cards = new ArrayList();
        allDecks.add(this);
        if(c == 0)
            defaultDecks.add(this);
    }

    public void addToDeck(Card c){
        cards.add(c);
    }

    public Card getCard(int index){
        return cards.get(index);
    }

    public ArrayList getAllCards(){
        return cards;
    }

    public int getDeckSize(){
        return cards.size();
    }
    
    public int getCost(){
        return cost;
    }
    
    public void timer(){
        
    }
        
    public void oneVO(){
        //to be determined after consultation
    }

    public int getDeckPts() {
        return deckPts;
    }

    public int getNumLives() {
        return numLives;
    }
   
    public String getName() {
        return name;
    }
    
    public ArrayList<Deck> getAllDecks() {
        return allDecks;
    }
}
