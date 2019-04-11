package harshit.entities;

import harshit.resources.Resources;

import java.awt.*;

public class Pakiahappy extends  Entity {
    private int z;

    public Pakiahappy(int x, int y) {

        super(x, y);

        this.width=60;
        this.height=65;
        this.image=Resources.happypakiaImage;
    }

    @Override
    public void update() {
        z=Util.happypakiaVisible();
        if(z==3) {
            this.isMoving=true;
        }

        if(this.inAir&&this.y>570&&this.isMoving){
                this.inAir=false;
                this.isMoving=false;
                this.yVel=0;
                this.yAcc=0;
                this.xVel=0;
                this.xAcc=0;
                this.x=Util.randompakiaCord();

        }

        if(!this.inAir&&this.isMoving){
            if(!this.muteOn){
                Resources.pakiaJumpAudio.play();
            }
            this.yVel=-30;
            this.yAcc=Util.pakiayAcc();
            if(this.yAcc==1)
                this.xVel=-15;
            else 
                this.xVel=-10;
            this.inAir=true;

        }

//        if(this.y>=600){
//            this.isVisible=false;
//            this.x=Util.randompakiaCord();
//            this.y=570;
//        }
//
//        if(this.y>200&&this.isVisible){
//            this.yVel=-10;
//            this.xVel=-7;
//        }
//
//        if(this.y<=200){
//            this.yVel=10;
//            this.xVel=-7;
//
//            this.isVisible=false;
//        }
        super.update();

    }
}
