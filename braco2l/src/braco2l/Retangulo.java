/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package braco2l;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author marcio
 */
public class Retangulo extends Forma {
    private ArrayList<Forma> formas;
    /**
     * @return the w
     */
    public int getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(int w) {
        this.w = w;
    }

    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     *
     * @param w largura
     * @param h altura
     * @param a angulo
     * @param x posição x
     * @param y posicao y
     */
    public Retangulo(int w, int h, int a, int x, int y, Color cor) {
        super(x, y, cor);
        this.w = w;
        this.h = h;
        this.a = a;
        formas = new ArrayList<>();
    }

    @Override
    public void render(Graphics2D g2d) {
        //g2d.rotate(Math.toRadians(45));
        g2d.rotate(Math.toRadians(a), x + (int) (h / 2), y + (int) (h / 2));
        g2d.setColor(getCor());
        g2d.fillRect(x, y, w, h);
        g2d.rotate(-Math.toRadians(a), x + (int) (h / 2), y + (int) (h / 2));
        for(Forma f: formas){
            f.setX((int) (Math.cos(Math.toRadians(a))*getW())-30);
            f.setY((int) (Math.sin(Math.toRadians(a))*getW())-10);
            f.render(g2d);
        }
       
      //   g2d.rotate(-Math.toRadians(a), x + (int) (h / 2), y + (int) (h / 2));
    }

    private int w;
    private int h;
    private int a;

    /**
     * @return the formas
     */
    public ArrayList<Forma> getFormas() {
        return formas;
    }

    /**
     * @param formas the formas to set
     */
    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }

}
