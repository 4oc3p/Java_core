package homework.ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 * Created by 4oc3p on 21.09.2017. Java_core
 */
public class MyDrawPanel extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = ((Graphics2D) g);


        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradientPaint = new GradientPaint(0, 0, startColor, 0, this.getHeight(), endColor);
        g2.setPaint(gradientPaint);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}
