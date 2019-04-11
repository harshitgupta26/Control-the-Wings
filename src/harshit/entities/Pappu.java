package harshit.entities;

import harshit.resources.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Pappu extends Entity {

    private List<Image> allImages = new ArrayList<>();

    private int imageIndex = 0;


    public Pappu(int x, int y) {
        super(x, y);

        this.width = 60;
        this.height = 65;

        this.allImages.add(Resources.pappuImage1);
        this.allImages.add(Resources.pappuImage2);
        this.allImages.add(Resources.pappuImage3);
        this.allImages.add(Resources.pappuImage4);
        this.allImages.add(Resources.pappuImage5);
    }

    public void update() {
        super.update();
        if(this.isMoving) {
            this.imageIndex %= 5;
            this.image = this.allImages.get(this.imageIndex);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            imageIndex++;
        }
        else{
            this.image=Resources.pappuImage1;
        }
    }

    public void move() {
        this.yAcc=3;
        this.yVel=-17;
    }


}