package harshit.entities;

import harshit.resources.Resources;

public class Star extends Entity {
    public Star(int x, int y) {
        super(x, y);

        this.height=40;
        this.width=40;
        this.xVel=-10;
        this.image=Resources.starImage;
    }

    @Override
    public void update() {
        super.update();

//        if(!this.isVisible){
//            this.y=Util.randomStarYCord();
//            this.x = Util.randomStarXCord();
//        }
        if(this.x<-50){
            this.isVisible=true;
            this.y=Util.randomStarYCord();
            this.x = Util.randomStarXCord();
        }

    }
}
