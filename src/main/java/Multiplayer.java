
import bowling.MultiPlayerGame;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedago
 */

public class Multiplayer implements MultiPlayerGame {
    ArrayList<Player> joueurs = new ArrayList<Player>();
    Integer jActuel = 0;
    
    public Multiplayer(){
        
        
    }
    
    public void lancer(Integer q){
        Player J = joueurs.get(jActuel);
        J.lancer(q);
        if (J.hasCompletedFrame()){
            jActuel += 1;
        }
    }

    @Override
    public String startNewGame(String[] playerName) throws Exception {
        for (int i = 0; i < playerName.length; i++) {
            Player k = new Player(playerName[i]); 
            joueurs.add(k);
        }
        Player P1 = joueurs.get(0);
        return P1.infos();
    }

    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
