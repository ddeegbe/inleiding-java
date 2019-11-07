
import java.awt.*;
import java.applet.*;

public class AppletEx extends Applet {
    // Override init()

    public void init() {
        setBackground(Color.white);
    }

    // Overidepaint()

    public void paint(Graphics g) {
        Font font = new Font("Serif",Font.BOLD,72);
        g.setFont(font);
        g.setColor(Color.blue);
        g.drawString("Damian",250,150);
    }
}