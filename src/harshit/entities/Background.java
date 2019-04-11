package harshit.entities;

import harshit.main.Game;
import harshit.resources.Resources;

public class Background extends Entity {

    public Background(int x, int y) {
        super(x, y);

        this.width= Game.GAME_WIDTH;
        this.height=Game.GAME_HEIGHT;
        this.image=Resources.backGroundImage;
        this.xVel=-10;

    }

    public void update() {

        super.update();
        if(this.x<=-800){
            this.x=798;
        }

    }
}



