/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package braco2l;

/**
 *
 * @author marcio
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Forma {
    protected int x;
    protected int y;
    private Color cor;
    public Forma(int x, int y, Color cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }



    public void render(Graphics2D g2d){
        try {
            throw new Exception("Nao implementado");
        } catch (Exception ex) {
            Logger.getLogger(Forma.class.getName()).log(Level.SEVERE, null, ex);
        }
    };

    /**
     * @return the cor
     */
    public Color getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(Color cor) {
        this.cor = cor;
    }
}
