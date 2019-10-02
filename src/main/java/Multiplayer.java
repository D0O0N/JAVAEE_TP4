
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
    public ArrayList<Player> joueurs = new ArrayList<Player>();
    public Integer jActuel = 0;
    
    public Multiplayer(){
        
        
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
        Player J = joueurs.get(jActuel % joueurs.size());
        Player Js = new Player("");
        Integer q = nombreDeQuillesAbattues;
        J.lancer(q);
        if(isFinished()){
            return "Partie Terminée";
        }
        if (J.isFinished() || J.hasCompletedFrame()){
            jActuel += 1;
        }
        Js = joueurs.get(jActuel % joueurs.size());
        return Js.infos();
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isFinished(){
        for(Player p : joueurs){
            if (!p.isFinished()){
                return false;
            }
        }
        return true;
    }
    
}
