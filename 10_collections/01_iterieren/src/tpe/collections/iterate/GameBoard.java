package tpe.collections.iterate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.sprite.Sprite;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Anzahl der Münzen. */
    private static final int NUM_COINS = 10;

    /** Münzgenerator. */
    private CoinGenerator generator;
    
    Collection<Sprite> coins= new ArrayList<>();

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(600, 600), Color.BLACK);

        generator = new CoinGenerator(this, NUM_COINS);

        Iterator<Sprite> iterator=generator.iterator();
        while(iterator.hasNext()){
            coins.add(iterator.next());
        }
    }


    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public synchronized void drawGame(Graphics g) {
        for(Sprite s : coins){
            s.draw(g);
        }
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        return true;
    }
}
