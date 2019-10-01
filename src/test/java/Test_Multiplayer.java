/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bowling.MultiPlayerGame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pedago
 */
public class Test_Multiplayer {
    public MultiPlayerGame game;
    public String[] players = { "John", "Paul", "Georges", "Ringo" };
    public Test_Multiplayer() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        game = new Multiplayer();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Test1() throws Exception {
        
        assertEquals(game.startNewGame(players),"Prochain tir : joueur John, tour n° 1, boule n° 1");
                
                
    }
}
