package homework.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Created by 4oc3p on 21.09.2017. Java_core
 */
public class FirstUI {

    private JButton button;
    private JButton button2;
    private JFrame frame;

    public static void main(String[] args) {
        FirstUI firstUI = new FirstUI();
        firstUI.go();
    }

    public void go() {
        frame = new JFrame();
        button = new JButton("Button");
        button2 = new JButton("Button2");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.EAST, button2);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }


    class ColorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
