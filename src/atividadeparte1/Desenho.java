/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeparte1;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Sales
 */
public class Desenho extends Canvas implements KeyListener, MouseListener, MouseMotionListener{
    
   int x = -1, y = - 1, x2 = -1, y2 =-1;
   boolean nnw = false;
    public Desenho(){
        
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        this.setBackground(Color.black);
        
    }
    
    public void paint(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.setStroke(new BasicStroke(2));
    g2.setColor(Color.white);
    
    if(x2!=-1 && x!=-1){
       g2.drawLine(x, y, x2, y2);
    }
    
    if(nnw){
    g2.setColor(Color.white);
    g2.fillRect(0,-10,600,600);
    nnw=false;
    }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar()=='n'){
        nnw=true;
        paint(this.getGraphics());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        paint(this.getGraphics());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x=-1;
        x2=-1;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
      x2=e.getX();
      y2=e.getY();
      paint(this.getGraphics());  
      x=x2;
      y=y2;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
}
