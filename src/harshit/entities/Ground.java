package harshit.entities;

import harshit.main.Game;
import harshit.resources.Resources;

public class Ground extends Entity {
    public Ground(int x, int y) {
        super(x, y);

        this.width= Game.GAME_WIDTH;
        this.height=Game.GAME_HEIGHT;
        this.image=Resources.groundImage;
    }

    @Override
    public void update() {
        super.update();
        this.xVel=-10;
    }
}
