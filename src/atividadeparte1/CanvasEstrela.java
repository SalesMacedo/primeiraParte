/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeparte1;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Sales
 */
public class CanvasEstrela {
    Frame f = new Frame();

    public CanvasEstrela() {
        f.setSize(310, 400);
        f.setLocation(100, 100);
        f.setTitle("Estrela");
        f.setResizable(false);
        
        f.setVisible(true);
        
        f.add(new MyCanvas());
    }
    
    public static void main(String[] args) {
        CanvasEstrela cw = new CanvasEstrela(); 
    }
    
    class MyCanvas extends Canvas {

      public MyCanvas () {
         setBackground (Color.black);
         setSize(300, 300);
     
      }

      @Override
      public void paint (Graphics g) {
          Graphics2D G;
         G = (Graphics2D) g;
         
    G.setStroke(new BasicStroke(2));
    G.setColor(Color.white);
         G.drawLine(150, 0, 0, 300);
         G.drawLine(0, 300, 300, 100);
         G.drawLine(300, 100, 0, 100);
         G.drawLine(0, 100, 300, 300);
         G.drawLine(300, 300, 150, 0);
         
      }
   }
    
}
