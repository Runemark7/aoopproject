package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControllers implements KeyListener {
    public boolean up,down,left,right;

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W) {
            up = true;
        }
        if(code == KeyEvent.VK_A) {
            right = true;
        }
        if(code == KeyEvent.VK_D) {
            left = true;
        }
        if(code == KeyEvent.VK_S) {
            down = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W) {
            up = false;
        }
        if(code == KeyEvent.VK_A) {
            right = false;
        }
        if(code == KeyEvent.VK_D) {
            left = false;
        }
        if(code == KeyEvent.VK_S) {
            down = false;
        }

    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }
}
