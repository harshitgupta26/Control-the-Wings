package harshit.entities;

import harshit.main.Game;
import harshit.resources.Resources;

public class Trees extends Entity{
    public Trees(int x, int y) {
        super(x, y);

        this.width= Game.GAME_WIDTH;
        this.height=Game.GAME_HEIGHT;
        this.image=Resources.frontTreesImage;
    }

    @Override
    public void update() {
        super.update();
    }
}
