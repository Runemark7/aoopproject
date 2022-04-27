package View;

import javax.swing.*;

public class MainView extends JFrame {

    public MainView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(500, 500);
        setFocusable(true);
        setVisible(true);
    }


}
