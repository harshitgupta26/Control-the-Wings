package harshit.entities;

import harshit.resources.Resources;


public class Fork extends Entity {
    public Fork(int x, int y) {
        super(x, y);

        this.width=40;
        this.height=350;
        this.xVel=-10;
        this.image=Resources.forkHandle;

    }

    @Override
    public void update() {

        super.update();
//        if(this.x<=-60){
//            this.x=Util.randomForkXCord();
//            this.isVisible = true;
//        }
    }
}
