package harshit.entities;

import harshit.resources.Resources;


public class Mute extends Entity {

    private boolean isAudio;
    public Mute(int x, int y) {
        super(x, y);

        this.width=51;
        this.height=40;
    }

    @Override
    public void update() {
        if(muteOn){
            this.image=Resources.muteOnImage;
        }
        else{
            this.image=Resources.muteOffImage;
        }
        super.update();
    }
}
