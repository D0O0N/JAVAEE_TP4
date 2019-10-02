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
    public Multiplayer game;
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
        
        assertEquals("Premier ","Prochain tir : joueur John, tour n° 1, boule n° 1",game.startNewGame(players));
        assertEquals("Prochain tir : joueur Paul, tour n° 1, boule n° 1",game.lancer(10));
        assertEquals("Prochain tir : joueur Paul, tour n° 1, boule n° 2",game.lancer(3));
        assertEquals("Prochain tir : joueur Georges, tour n° 1, boule n° 1",game.lancer(7));
        assertEquals("Prochain tir : joueur Georges, tour n° 1, boule n° 2",game.lancer(0));
        assertEquals("Prochain tir : joueur Ringo, tour n° 1, boule n° 1",game.lancer(0));
        assertEquals("Prochain tir : joueur Ringo, tour n° 1, boule n° 2",game.lancer(0));
        assertEquals("Prochain tir : joueur John, tour n° 2, boule n° 1",game.lancer(0));
        assertEquals("Prochain tir : joueur John, tour n° 2, boule n° 2",game.lancer(6));
        assertEquals("Prochain tir : joueur Paul, tour n° 2, boule n° 1",game.lancer(3));
        assertEquals("Prochain tir : joueur Paul, tour n° 2, boule n° 2",game.lancer(5));
        assertEquals("Prochain tir : joueur Georges, tour n° 2, boule n° 1",game.lancer(0));
        int[] ScoreTest = {28,20,0,0};
        for (int i = 0; i<ScoreTest.length;i++){
            assertEquals(ScoreTest[i], game.joueurs.get(i).score());
        }      
    }
    @Test
    public void TestPerfectGame() throws Exception {
        
        assertEquals("Premier ","Prochain tir : joueur John, tour n° 1, boule n° 1",game.startNewGame(players));
        for (int i = 0; i < 12 * 4; i++) {
            System.out.println(game.lancer(10));
        }
        int[] ScoreTest = {300,300,300,300};
        for (int i = 0; i<ScoreTest.length;i++){
            assertEquals(ScoreTest[i], game.joueurs.get(i).score());
        }  
    }
}
