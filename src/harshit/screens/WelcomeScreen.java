package harshit.screens;

import harshit.entities.*;
import harshit.main.Game;
import harshit.main.GamePanel;
import harshit.resources.Resources;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class WelcomeScreen extends Screen {

    private Pappu pappu;
    private List<Clouds>cloudImages = new ArrayList<>();
    private Trees tree;
    private Ground ground;
    private Log log;

    public WelcomeScreen(GamePanel panel) {
        super(panel);

        this.cloudImages.add(new Clouds(0,-50));
        this.cloudImages.add(new Clouds(800,-50));
        this.ground=new Ground(0,0);
        this.tree=new Trees(0,0);
        this.log=new Log(50,330);
        this.pappu=new Pappu(36,280);
        this.pappu.isMoving = true;
        for(Clouds c:cloudImages){
            c.isMoving=true;
        }

        this.entities.addAll(this.cloudImages);
        this.entities.add(this.tree);
        this.entities.add(this.log);
        this.entities.add(this.ground);
        this.entities.add(this.pappu);
    }

    public void draw(Graphics g) {
        g.setColor(Resources.skyColor);
        g.fillRect(0,0,Game.GAME_WIDTH,Game.GAME_HEIGHT);
        g.drawImage(Resources.backTreeImage,0,0,Game.GAME_WIDTH,Game.GAME_HEIGHT,null);
//        g.drawImage(Resources.groundImage,0,0,Game.GAME_WIDTH,Game.GAME_HEIGHT,null);
        super.draw(g);
        g.drawImage(Resources.controlsImage,250,200,180,65,null);
        g.setColor(new Color(251, 247, 151));
        g.setFont(new Font("Forte",Font.BOLD,50));
        g.drawString("Control the Wings",170,40);
        g.setColor(new Color(251, 216, 105));
        g.setFont(new Font("Forte",Font.BOLD,40));
        g.drawString("By: Harshit Gupta",210,85);
        g.drawImage(Resources.standImage,600,120,null);
        g.drawImage(Resources.plank1Image,520,180,null);
        g.drawImage(Resources.plank2Image,520,280,null);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Forte",Font.BOLD,40));
        g.drawString("Start",570,225);
        g.drawString("Settings",570,320);
        g.drawString("",570,430);

    }

    public void update() {
        for(Clouds c:cloudImages){
            if(c.x<=-800)
                c.x=795;
        }
        super.update();

    }


    @Override
    public void onMousePress(int xCord, int yCord) {
        if (xCord >= 565 && xCord <= 665
                && yCord >= 190 && yCord <= 240) {
            this.gPanel.currentScreen = new Stage1Screen(gPanel);
            Cursor c=Cursor.getDefaultCursor();
            c=Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
            this.gPanel.setCursor(c);
        }


    }

    @Override
    public void onKeyPress(int keyCode){
        if(keyCode==KeyEvent.VK_SPACE){
            this.gPanel.currentScreen = new Stage1Screen(gPanel);
        }
    }

    @Override
    public void onMouseExited(int xCord, int yCord) {

        if (xCord >= 565 && xCord <= 665
                && yCord >= 190 && yCord <= 240) {
            Cursor c = Cursor.getDefaultCursor();
            c = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
            this.gPanel.setCursor(c);
        }
    }
}

