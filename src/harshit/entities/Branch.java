package harshit.entities;

import harshit.resources.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Branch extends Entity {

    public Branch(int x, int y) {
        super(x, y);

        this.image=Resources.branchImage;
        this.width=31;
        this.height=300;
        this.xVel=-10;

    }

    public void update(){
        super.update();
//        if(this.x<=-60){
//            this.x=Util.randombranchxCord();
//            this.isVisible = true;
//        }
    }
}
