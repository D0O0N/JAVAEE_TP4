
import bowling.SinglePlayerGame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedago
 */
public class Player extends SinglePlayerGame{
    String name;
    public Player(String name){
        this.name = name;
    }
    public Integer tour(){
        return this.getFrameNumber();
    }
    public String toString (){
        return name;
    }
    public String infos (){
        return "Prochain tir : joueur " + this.name+ ", tour n° "+ this.tour() +", boule n° "+this.getNextBallNumber();
    }
    
}
