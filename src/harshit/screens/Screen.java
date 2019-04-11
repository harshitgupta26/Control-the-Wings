package harshit.screens;

import harshit.entities.Entity;
import harshit.entities.Mute;
import harshit.main.GamePanel;
import harshit.resources.Resources;

import java.awt.*;
import java.util.*;

abstract public class Screen {

    protected GamePanel gPanel;
    protected java.util.List<Entity> entities = new ArrayList<>();
    protected Mute muteimage;
    protected static final int MUTE_X_CORD=720;
    protected static final int MUTE_Y_CORD=20;

    public Screen(GamePanel p) {
        super();
        this.gPanel = p;
        this.muteimage =new Mute(MUTE_X_CORD,MUTE_Y_CORD);
    }

    public void draw(Graphics g) {
        for(Entity e: entities) {
            if(e.isVisible) {
                g.drawImage(e.image, e.x, e.y,e.width,e.height,null);
            }
        }
    }

    public void update() {
        for(Entity e: this.entities) {
            e.update();
        }
    }

    public void onMousePress(int xCord, int yCord) {
        if(xCord>MUTE_X_CORD&&xCord<MUTE_X_CORD+51
                &&yCord>MUTE_Y_CORD&&yCord<MUTE_Y_CORD+40) {
            if (!this.muteimage.muteOn) {
                this.muteimage.muteOn = true;
                Resources.backGroundMusic.stop();
            }
             else {
                this.muteimage.muteOn = false;
                Resources.backGroundMusic.loop();
            }

        }

    }

    public void onKeyPress(int keyCode) {

    }
    public void onKeyReleased(int keyCode){

    }
    public void onKeyTyped(int keyCode){

    }
    public void onMouseExited(int xCord,int yCord){

    }
}