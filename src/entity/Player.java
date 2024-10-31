package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.*;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyHandler;

    public Player(GamePanel gp, KeyHandler keyHandler) {
        this.gp = gp;
        this.keyHandler = keyHandler;
        this.setDefaultValues();
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;
    }

    public void update() {
        if(keyHandler.upPressed) {
            y -= speed;
        }
        else if(keyHandler.downPressed) {
            y += speed;
        }
        else if(keyHandler.rightPressed) {
            x += speed;
        }
        else if(keyHandler.leftPressed) {
            x -= speed;
        }
    }

    public void paintComponent(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, gp.tileSize, gp.tileSize);
    }
}
