/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeparte1;

import java.awt.Color;
import java.awt.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Sales
 */
public class FormularioPreenchimentoNull extends JFrame{
    private void preenchimento() {

        //////nome
        JPanel dados1 = new JPanel();
        dados1.setLayout(null);

        JLabel Labelnome = new JLabel("Nome: ");
        Labelnome.setForeground(Color.black);
        Labelnome.setSize(50, 25);
        Labelnome.setLocation(10, 10);

        JTextField nome = new JTextField(40);
        nome.setSize(450, 25);
        nome.setLocation(50, 10);
        dados1.add(Labelnome);
        dados1.add(nome);
        ////////////

        /////////sexo
        JRadioButton Masculino = new JRadioButton("Masculino");
        //Masculino.setSelected(true);
        JRadioButton Feminino = new JRadioButton("Feminino");

        JLabel sexoTipo = new JLabel("Sexo: ");
        sexoTipo.setForeground(Color.black);
        ButtonGroup sexo = new ButtonGroup();
        Masculino.setForeground(Color.black);
        Feminino.setForeground(Color.black);
        sexo.add(Masculino);
        sexo.add(Feminino);

        Masculino.setSize(88, 25);
        Feminino.setSize(100, 25);
        Masculino.setLocation(195, 50);
        Feminino.setLocation(280, 50);
        sexoTipo.setSize(50, 25);
        sexoTipo.setLocation(160, 50);

        Masculino.setBackground(Color.getHSBColor(219, 112, 147));
        Feminino.setBackground(Color.getHSBColor(219, 112, 147));
        dados1.add(sexoTipo);
        dados1.add(Masculino);
        dados1.add(Feminino);

        ///////////
        ///////disciplinas
        List disc = new List(8, true);
        JLabel discP = new JLabel("DISCIPLINAS DESEJADAS");
        discP.setForeground(Color.black);

        disc.add("Cálculo");
        disc.add("Algol I");
        disc.add("Algol II");
        disc.add("Redes I");
        disc.add("Redes 2");
        disc.add("Circuitos");
        disc.add("Prolog");
        disc.add("IHC");

        discP.setSize(200, 25);
        discP.setLocation(205, 85);
        disc.setSize(100, 130);
        disc.setLocation(228, 110);
        dados1.add(discP);
        dados1.add(disc);
        ////////////
        ////////////Comenteario

        JLabel msg = new JLabel("DEIXE UM COMENTÁRIO");
        msg.setForeground(Color.black);
        JTextArea coment = new JTextArea(8, 50);

        msg.setSize(200, 25);
        msg.setLocation(210, 260);
        coment.setSize(400, 80);
        coment.setLocation(80, 300);
        //coment.setBackground(Color.LIGHT_GRAY);
        coment.setForeground(Color.black);
        dados1.add(msg);
        dados1.add(coment);
        //////////
        /////////cadastrar

        JButton cad = new JButton("CADASTRAR INFORMAÇÕES");
        cad.setSize(200, 25);
        cad.setLocation(165, 420);
        //cad.setBackground(Color.GREEN);  
        cad.setForeground(Color.black);
        dados1.add(cad);
        ////////
        dados1.setBackground(Color.getHSBColor(219, 112, 147));
        add(dados1);

    }

    public FormularioPreenchimentoNull() {
        this.preenchimento();
    }

    public static void main(String[] args) {

        FormularioPreenchimentoNull f = new FormularioPreenchimentoNull();
        f.setVisible(true);
        f.setLocation(0, 0);
        f.setSize(550, 550);
        f.setResizable(false);

    }
}
