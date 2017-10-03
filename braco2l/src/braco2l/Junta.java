/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package braco2l;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author marcio
 */
public class Junta extends Forma {

  
    private int raio;
    

  
    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }

    /**
     *
     * @param x
     * @param y
     * @param diametro
     * @param cor
     */
   

    public Junta(int diametro, int x, int y,Color cor){
        super(x, y, cor);
        this.raio = diametro;
        
    }

    @Override
    public void render(Graphics2D g2d) {
        g2d.setColor(getCor());
        g2d.fillArc(x, y, raio, raio, 0, 360);
    }
    
}
