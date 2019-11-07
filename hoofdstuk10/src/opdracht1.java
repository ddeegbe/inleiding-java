public class opdracht1 {
}

import java.awt.*;
        import java.applet.*;
        import java.awt.event.*;


public class Beslissingen2 extends Applet {

    int leeftijd;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";

        label = new Label("Vul een getal in" );

        add( label );
        add( tekstvak );
    }


        }
    }
}
