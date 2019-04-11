package harshit.entities;

import harshit.resources.Resources;

public class Berries extends Entity {
    public Berries(int x, int y) {
        super(x, y);

        this.height = 50;
        this.width = 40;
        this.xVel = -10;
        this.image = Resources.berriesImage;

    }

    @Override
    public void update() {
        super.update();

        if(!this.isVisible) {
            this.y = Util.randomBerryYCord();
            this.x = Util.randomBerryXCord();
        }

        if(this.x < -50) {
            this.x = 1000;
            this.isVisible = true;
        }
    }
}
