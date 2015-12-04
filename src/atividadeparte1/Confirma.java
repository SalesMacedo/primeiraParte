/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeparte1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sales
 */
public class Confirma extends JFrame {
    public Confirma() {
        super("Confirmação");

        responde();
    }

    private void responde() {

        JLabel pergunta = new JLabel("Deseja realmente cadastrar estas informações?");
        pergunta.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 16));

        JPanel confirmacao = new JPanel();
        confirmacao.setLayout(null);

        JButton sim = new JButton("Confirmar");
        JButton nao = new JButton("Cancelar");
        sim.setFont(new Font("Arial", Font.BOLD, 14));
        nao.setFont(new Font("Arial", Font.BOLD, 14));

        sim.setSize(130, 25);
        sim.setLocation(30, 60);

        nao.setSize(130, 25);
        nao.setLocation(234, 60);

        pergunta.setSize(400, 30);
        pergunta.setLocation(18, 10);

        confirmacao.add(pergunta);
        confirmacao.add(sim);
        confirmacao.add(nao);

        confirmacao.setBackground(Color.getHSBColor(219, 112, 147));

        //add(Panelpergunta, BorderLayout.NORTH);
        add(confirmacao, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Confirma c = new Confirma();

        c.setVisible(true);
        c.setSize(400, 130);
        c.setResizable(false);
        c.setLocation(450, 300);
    }
    
}
