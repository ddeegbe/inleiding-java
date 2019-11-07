public class opdrachtt1 {
}


import java.awt.*;
        import java.applet.*;
        import java.awt.event.*;

public class Tekstknop extends Applet {
    TextField tekstvak;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Type iets " +
                "in het vakje " +
                "en klik op Oke", 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.getText();
            repaint();
        }
    }
}