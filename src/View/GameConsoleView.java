package View;

import Model.MapModel;

import javax.swing.*;
import java.awt.*;

/**
 * Creates the game console view.
 */
public class GameConsoleView extends JPanel {
    private MapModel mapModel;
    private JButton restartButton;
    private JLabel scoreValue;
    private JButton nextMapButton;
    private JLabel mapIdLabel;
    private JLabel youWinLabel;

    /**
     * Constructor, creates the view for the game console
     */
    public GameConsoleView(MapModel mapModel) {
        this.mapModel = mapModel;
        setLayout(new FlowLayout());
        add(new JLabel("Game Console"));
        JLabel scoreValue = new JLabel("0");
        JLabel mapIdLabel = new JLabel("Map ID: ");
        JLabel scoreLabel = new JLabel("Moves: ");
        JLabel mapIdValue = new JLabel("0");
        JButton nextMapButton = new JButton("Next Map");
        JButton restartButton = new JButton("Restart");
        JLabel youWinLabel = new JLabel("You Win!");
        youWinLabel.setVisible(false);
        nextMapButton.setVisible(false);
        add(mapIdLabel);
        add(mapIdValue);
        add(scoreLabel);
        add(scoreValue);
        add(restartButton);
        add(nextMapButton);
        add(youWinLabel);
        this.youWinLabel = youWinLabel;
        this.nextMapButton = nextMapButton;
        this.restartButton = restartButton;
        this.scoreValue = scoreValue;
        this.mapIdLabel = mapIdValue;
    }

    /**
     * Following methods are used to get the buttons from the view and handles the logic for the buttons
     */
    public JButton getNextMapButton() {
        return nextMapButton;
    }

    public JButton getRestartButton(){
        return restartButton;
    }

    public void showYouWin() {
        youWinLabel.setVisible(true);
        youWinLabel.repaint();
    }

    public void hideYouWin() {
        youWinLabel.setVisible(false);
        youWinLabel.repaint();
    }

    public void showNextButton() {
        nextMapButton.setVisible(true);
        nextMapButton.repaint();
    }

    public void hideNextButton() {
        nextMapButton.setVisible(false);
        nextMapButton.repaint();
    }

    /**
     * Following methods are used to update the labels in the view
     */
    public void updateScoreView() {
        scoreValue.setText(mapModel.getMovesMade()+"");
        scoreValue.repaint();
        mapIdLabel.setText(mapModel.getMapID()+"");
        mapIdLabel.repaint();
        validate();
        repaint();
    }
}
