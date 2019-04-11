package harshit.entities;

import harshit.resources.Resources;

public class Log extends Entity {
    public Log(int x, int y) {
        super(x, y);

            this.x = x;
            this.y = y;
            this.width = 71;
            this.height = 119;
            this.image = Resources.logImage;



    }

    @Override
    public void update() {
        if(!this.isVisible){
            this.width=0;
            this.height=0;
        }
        super.update();
    }
}


