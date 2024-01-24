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
public class User {
    protected String username, password;
    protected int currentLevel, careerPts;
    private int sessionPts;
    private boolean signedIn;
    protected ArrayList<User> userList;
    protected ArrayList<Deck> accessibleDecks;
    protected ArrayList<PowerUps> powerUpsStock;
    
    public User(String inputU, String inputPw){
        this.username = inputU;
        this.password = inputPw;
        this.currentLevel = 0;
        this.careerPts = 0;
        this.sessionPts = 0;
        userList.add(this);
        for(Deck d : Deck.defaultDecks){
            accessibleDecks.add(d);
        }
    }
    
    public User(){      
    }
        
    public void signIn(String inputU, String inputPw){
        for(User u : getUserList()){
            if(u.getUsername() == inputU && u.getPassword() == inputPw){
                signedIn = true;
                this.careerPts = u.careerPts;
                this.sessionPts = 0;
            }
            else{
                System.out.println("Username and/or password is incorrect.");
            }
        }
    }
    
    public void signOut(){
        signedIn = false;
    }
    
    public void answer(Card c, String inputAns){
        if(inputAns.equalsIgnoreCase(c.getAns())){
            this.sessionPts++;
            c.setCorrectCount(c.getCorrectCount() + 1);
            if(isSignedIn())
                this.careerPts++;            
        }
        
        else
            c.setWrongCount(c.getWrongCount() + 1);
    }
    
    public void answer(Card c, String inputAns, PowerUps p){
        if(p.getName() == "Double Jeopardy"){
            p.doubleJeop(c, inputAns);
            this.sessionPts = p.effect + this.getSessionPts();
            
            if(isSignedIn())
                this.careerPts = p.effect + this.careerPts;
            
        }
        
        if(p.getName() == "2X"){
            p.twoX(c, inputAns);
            this.sessionPts = p.effect + this.getSessionPts();
            
            if(isSignedIn())
                this.careerPts = p.effect + this.careerPts;
            
        }
    }
        
    public void buy(Deck d){
        getAccessibleDecks().add(d);
        this.careerPts = this.careerPts - d.getCost();
    }
    
    public void buy(PowerUps p, int n){
        getPowerUpsStock().add(p);
        this.careerPts = this.careerPts - (p.getCost() * n);
    }
        
    public void displayDecks(){
        System.out.println(this.username + " can access the ff. decks: ");
        for(Deck d : getAccessibleDecks()){
            System.out.println(d.getName());
        }
    }
    
    public void displayPowerUps(){
        System.out.println(this.username + " has the ff. powerups left: ");
        for(PowerUps p : getPowerUpsStock()){
            System.out.println(p.getName());
        }
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getCareerPts() {
        return careerPts;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public ArrayList<Deck> getAccessibleDecks() {
        return accessibleDecks;
    }

    public ArrayList<PowerUps> getPowerUpsStock() {
        return powerUpsStock;
    }

    /**
     * @return the sessionPts
     */
    public int getSessionPts() {
        return sessionPts;
    }

    /**
     * @return the signedIn
     */
    public boolean isSignedIn() {
        return signedIn;
    }
    
}
