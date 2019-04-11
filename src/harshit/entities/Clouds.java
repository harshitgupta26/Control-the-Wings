package harshit.entities;

import harshit.main.Game;
import harshit.resources.Resources;

public class Clouds extends Entity {
    public Clouds(int x, int y) {
        super(x, y);

        this.width= Game.GAME_WIDTH;
        this.height=Game.GAME_HEIGHT;
        this.image=Resources.cloudImage;
        this.xVel=-9;
    }

    @Override
    public void update() {
        super.update();

    }
}
