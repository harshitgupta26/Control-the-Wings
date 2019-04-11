package harshit.screens;

import harshit.entities.Entity;
import harshit.main.Game;
import harshit.main.GamePanel;
import harshit.resources.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GameOverScreen extends Screen {


    public GameOverScreen(GamePanel panel) {
        super(panel);
        this.entities.add(muteimage);
    }

    public void update() {
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.drawImage(Resources.backGroundImage,0,0,Game.GAME_WIDTH,Game.GAME_HEIGHT,null);
        g.drawImage(Resources.logImage,50,330,null);
        g.drawImage(Resources.standImage,600,100,null);
        g.drawImage(Resources.groundImage,0,0,Game.GAME_WIDTH,Game.GAME_HEIGHT,null);
        g.drawImage(Resources.plank1Image,520,180,null);
//        g.drawImage(Resources.plank2Image,520,200,null);
//        g.drawImage(Resources.plank3Image,520,300,null);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Forte",Font.BOLD,40));
        g.drawString("Re-Start",555,225);
        g.drawString("",570,240);
        g.drawString("",570,350);

        g.setColor(Color.red);
        g.setFont(new Font("Forte", Font.BOLD, 18));
        g.drawString("Game Over. Press Space to Restart", 10, 70);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Forte",Font.BOLD,40));
        g.drawString("SCORE: "+Entity.score,Entity.SCORE_X_CORD,Entity.SCORE_Y_CORD);
    }

    @Override
    public void onKeyPress(int keyCode) {

        if(keyCode==KeyEvent.VK_SPACE) {
            this.gPanel.currentScreen = new Stage1Screen(this.gPanel);
        }

    }

    @Override
    public void onMousePress(int xCord, int yCord) {
        if (xCord >= 555 && xCord <= 755
                && yCord >= 200 && yCord <= 260) {
            this.gPanel.currentScreen = new Stage1Screen(gPanel);
        }
    }
}