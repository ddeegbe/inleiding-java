package com.company;

public class Main {

    public static void main(String[] args) {
	import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
/**

 */
        public class DamianDeegbe extends Applet {  // save as "Damian.java"
            public void paint(Graphics g) {
                setBackground(Color.blue);   // set background color
                g.setColor(Color.yellow);     // set foreground text color
                g.setFont(new Font("Times New Roman", Font.BOLD, 30)); // set font face, bold and size
                g.drawString("Damian, Deegbe", 20, 80);  // draw string with baseline at (20, 80)
            }
        }
    }
}
