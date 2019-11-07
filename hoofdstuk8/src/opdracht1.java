public class opdracht1 {
}

import javax.swing.*;
        import java.awt.*;
        import javax.swing.border.EtchedBorder;

public class VerticalLabel extends JLabel{

    public VerticalLabel(String labelText){
        this.setHorizontalAlignment(LEFT);
        this.setVerticalAlignment(CENTER);
        this.setText(labelText);
        this.setVerticalTextPosition(CENTER);
        //this.setUI( new VerticalLabelUI(false) );
        this.setBorder( new EtchedBorder() );
    }

    public static void main(String[] args){
        // should be done on the EDT.
        JFrame frame = new JFrame("Main");
        frame.getContentPane().setLayout( new GridBagLayout() );
        frame.getContentPane().add(new VerticalLabel("OK"));
        Dimension prefSize = new Dimension(200,150);
        frame.setPreferredSize(prefSize);
        frame.setMinimumSize(prefSize);
        frame.pack();
        frame.setVisible(true);
    }
}


