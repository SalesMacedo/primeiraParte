/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeparte1;

import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Sales
 */
public class Login extends JFrame{
     public Login() {
        super("Tela de login de usuário");
        formulario();
    }

    private void formulario() {
        setLayout(new BorderLayout());

        JPanel Ptitulo = new JPanel();
        Ptitulo.setLayout(new FlowLayout());

        JLabel titulo = new JLabel("FAÇA SEU LOGIN!");
        titulo.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 16));

        Ptitulo.add(titulo);

        JPanel dados = new JPanel();
        dados.setLayout(new FlowLayout());

        JLabel loginLabel = new JLabel("Login: ");
        JTextField loginTexto = new JTextField(40);

        JLabel senhaLabel = new JLabel("Senha: ");
        JTextField senhaTexto = new JPasswordField(39);

        dados.add(loginLabel);
        dados.add(loginTexto);
        dados.add(senhaLabel);
        dados.add(senhaTexto);

        JPanel botao = new JPanel();
        botao.setLayout(new FlowLayout());

        JButton entrar = new JButton("Login");

        botao.add(entrar);
        dados.setBackground(Color.getHSBColor(219, 112, 147));
        Ptitulo.setBackground(Color.getHSBColor(219, 112, 147));
        botao.setBackground(Color.getHSBColor(219, 112, 147));

        add(Ptitulo, BorderLayout.NORTH);
        add(dados, BorderLayout.CENTER);
        add(botao, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        Login l = new Login();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setSize(530, 170);
        l.setVisible(true);
        l.setResizable(false);
        l.setLocation(450, 300);
    }
}
