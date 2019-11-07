
import java.awt.*;
import java.applet.*;

public class AppletEx extends Applet {
    // Override init()

    public void init() {
        setBackground(Color.blue;
    }

    // Overidepaint()

    public void paint(Graphics g) {
        Font font = new Font("Serif",Font.BOLD,72);
        g.setFont(font);
        g.setColor(Color.yellow);
        g.drawString("Damian",250,150);
    }
}
