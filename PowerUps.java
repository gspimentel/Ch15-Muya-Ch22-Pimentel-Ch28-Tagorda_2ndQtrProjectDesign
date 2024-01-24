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
public class PowerUps {
    protected String name;
    protected int cost, effect;
    protected static ArrayList<PowerUps> allPowerUps;
    
    public PowerUps(String n, int c){
        this.name = n;
        this.cost = c;
        allPowerUps.add(this);
    }
    
    public void doubleJeop(Card c, String inputAns){
        if(inputAns.equalsIgnoreCase(c.getAns())){
            effect = 2;
            c.setCorrectCount(c.getCorrectCount() + 1);
        }
        else{
            effect = -2;
            c.setWrongCount(c.getWrongCount() + 1);
        }
    }
    
    public void twoX(Card c, String inputAns){
        if(inputAns.equalsIgnoreCase(c.getAns())){
            effect = 2;
            c.setCorrectCount(c.getCorrectCount() + 1);
        }
        else
            c.setWrongCount(c.getWrongCount() + 1);
    }
    
    public void attack(String fakeAns){
        //to be determined after consultation
    }
    
    public String getName() {
        return name;
    }
    
    public int getCost() {
        return cost;
    }
}
