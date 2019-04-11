package harshit.entities;

import harshit.resources.Resources;

public class InvertedFork extends Entity{
    public InvertedFork(int x, int y) {
        super(x, y);
        this.width = 30;
        this.height = 375;
        this.xVel = -10;
        this.image = Resources.invertedforkImage;
    }
}
