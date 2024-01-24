/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Charm_MuyaPimentelTagorda_2ndQtrProjectDesign;

/**
 *
 * @author Fifi
 */
public class Card {
    protected String question;
    private String answer;
    private int correctCount;
    private int wrongCount;

    public Card(String q, String a){
        this.question = q;
        this.answer = a;
    }
   
    public String getQuestion() {
        return question;
    }
   
    public String getAns() {
        return getAnswer();
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public int getWrongCount() {
        return wrongCount;
    }

    /**
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param correctCount the correctCount to set
     */
    public void setCorrectCount(int correctCount) {
        this.correctCount = correctCount;
    }

    /**
     * @param wrongCount the wrongCount to set
     */
    public void setWrongCount(int wrongCount) {
        this.wrongCount = wrongCount;
    }

}

