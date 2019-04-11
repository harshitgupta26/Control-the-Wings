package harshit.entities;

import harshit.main.Game;

import java.awt.*;

abstract public class Entity {
    public int x;
    public int y;
    public int xVel = 0;
    public int yVel = 0;
    public int xAcc = 0;
    public int yAcc = 0;
    public int width;
    public int height;
    public boolean isVisible = true;
    public boolean inAir = false;
    public boolean isMoving = false;
    public boolean muteOn =false;
    public Image image;
    public static int score=0;
    public static final int SCORE_X_CORD=50;
    public static final int SCORE_Y_CORD=50;
    private Rectangle rect = new Rectangle();

    public Entity(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void update() {
        if(this.isMoving){
        this.x += this.xVel;
        this.y += this.yVel;
        this.xVel += this.xAcc;
        this.yVel += this.yAcc;
        }
    }

    private void updateRect() {
        this.rect.setBounds(this.x, this.y, this.width-10, this.height-20);
    }

    public boolean isColliding(Entity other) {
        this.updateRect();
        other.updateRect();

        return this.isVisible && other.isVisible && this.rect.intersects(other.rect);
    }
}