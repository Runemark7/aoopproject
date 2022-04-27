package View;

import javax.swing.*;

public class MenuView extends JPanel {

    public MenuView() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Menu"));
        add(new JButton("Start"));
        add(new JButton("Exit"));




    }

}
