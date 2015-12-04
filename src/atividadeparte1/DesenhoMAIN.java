/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeparte1;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Sales
 */
public class DesenhoMAIN extends JFrame{
    public DesenhoMAIN(){
    Desenho d = new Desenho();
    
    add(d);
    }
    public static void main(String[] args) {
        DesenhoMAIN dm = new DesenhoMAIN();
        dm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dm.setSize(400, 300);
        dm.setTitle("USE O MOUSE PARA DESENHAR");
        dm.setVisible(true);
               
    }
}
