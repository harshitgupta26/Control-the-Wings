package harshit.entities;

import harshit.resources.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Superpower extends Entity {

    private List<Image> superpappu=new ArrayList<>();
    private int imageIndex=0;

    public Superpower(int x, int y) {
        super(x, y);
        this.width = 60;
        this.height = 65;

        this.superpappu.add(Resources.pappuImage1);
        this.superpappu.add(Resources.pappuImage2);
        this.superpappu.add(Resources.pappuImage3);
        this.superpappu.add(Resources.pappuImage4);
        this.superpappu.add(Resources.pappuImage5);
        this.isVisible=false;
    }

    @Override
    public void update() {

        this.imageIndex %= 5;
        this.image = this.superpappu.get(this.imageIndex);
//        try {
//            Thread.sleep(30);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        imageIndex++;

        if(this.isVisible) {
            this.xVel = +35;
        }
        if(this.y > 850) {
//            this.y = Util.randomsuperyCord();
//            this.x = 36;
            this.isVisible = false;
        }

        super.update();
    }
}
