package ejemplokey;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by rcraft on 11-15-16.
 */
public class Prueba  extends JFrame implements KeyListener
{
    JPanel panel;
    JTextField txt;


    public Prueba(String titulo)
    {
        super(titulo);
        panel=new JPanel(new FlowLayout());
        txt=new JTextField(60);
        txt.addKeyListener(this);
        panel.add(txt);
        setContentPane(panel);
    }
    public static void main(String args[])
    {
        Prueba prueba=new Prueba("Enter KeyListener");
        prueba.pack();
        prueba.setLocationRelativeTo(null);
        prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prueba.setVisible(true);

    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void keyPressed(KeyEvent e)
    {
        int i =e.getKeyChar();
        System.out.println(i);
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
        {
            JOptionPane.showMessageDialog(null,"EL enter ha sido presionado");
        }
        if(i==10)
        {
            JOptionPane.showMessageDialog(null,"Esta es la segunda condicion");
        }

    }

    public void keyReleased(KeyEvent e)
    {

    }
}
