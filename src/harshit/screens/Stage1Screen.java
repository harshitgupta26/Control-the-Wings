package harshit.screens;

import harshit.entities.Background;
import harshit.entities.*;
import harshit.main.Game;
import harshit.main.GamePanel;
import harshit.resources.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Stage1Screen extends Screen {

//    private List<Branch> branchImages=new ArrayList<>();
    private List<Background> backGroundImages=new ArrayList<>();
    private List<Ground> groundImages=new ArrayList<>();
    private List<Superpower>superpappu = new ArrayList<>();
    private List<Entity> branches = new ArrayList<>();
    private Pappu pappu;
//    private Fork fork;
    private Log log;
    private Star star;
    private Berries berries;
    private Pakiahappy happyPakia;
    private static boolean a = false;
    Timer timer = new Timer();


    public Stage1Screen(GamePanel panel) {
        super(panel);

        this.backGroundImages.add(new Background(0,0));
        this.backGroundImages.add(new Background(798,0));

        this.branches.add(new Branch(350,250));
        this.branches.add(new Branch(950,-100));
        this.branches.add(new InvertedFork(635,-90));
        this.branches.add(new Branch(1350, -50));
        this.branches.add(new InvertedFork(1650,150));
        this.branches.add(new Fork(1850,150));

        this.log=new Log(50,330);

        this.star=new Star(1000,Util.randomStarYCord());

        this.berries = new Berries(Util.randomBerryXCord(), Util.randomBerryYCord());

        this.groundImages.add(new Ground(0,0));
        this.groundImages.add(new Ground(800,0));

        this.pappu=new Pappu(36,279);

        this.superpappu.add(new Superpower(36, Util.randomsuperyCord()));
        this.superpappu.add(new Superpower(36, Util.randomsuperyCord()));
        this.superpappu.add(new Superpower(36,Util.randomsuperyCord()));

        this.happyPakia=new Pakiahappy(Util.randompakiaCord(),570);

        this.entities.addAll(this.backGroundImages);
//        this.entities.addAll(this.branchImages);
        this.entities.addAll(this.branches);
//        this.entities.add(this.fork);
        this.entities.add(this.log);
        this.entities.addAll(this.groundImages);
        this.entities.add(this.pappu);
        this.entities.addAll(this.superpappu);
        this.entities.add(this.happyPakia);
        this.entities.add(this.star);
        this.entities.add(this.berries);
        this.entities.add(muteimage);
        if(!this.muteimage.muteOn){
            Resources.backGroundMusic.loop();
        }

        Entity.score=0;

    }

    @Override
    public void update() {

        super.update();


//        this.a=Util.randombranchxCord();

        if(this.pappu.y>=550||this.pappu.y<=-90){
            this.gPanel.currentScreen=new GameOverScreen(this.gPanel);
        }

//        if(this.fork.isColliding(pappu)){
//            this.pappu.yVel = 0;
//            if(this.pappu.y>550){
//                this.gPanel.currentScreen=new GameOverScreen(gPanel);
//            }
//
//            this.gPanel.currentScreen=new GameOverScreen(this.gPanel);
//        }

        for(Entity b:branches){
            if(b.x<-500){
                b.x=1250 ;
                b.isVisible = true;
            }
            if(b.isColliding(pappu)) {
                this.gPanel.currentScreen = new GameOverScreen(gPanel);

            }
        }
//        for(Background b:backGroundImages){
//            if(b.x<=-800){
//                b.x=798;
//            }
//        }
        for(Ground d:groundImages){
            if(d.x<=-800){
                d.x=800;
            }
        }

        if(this.pappu.isColliding(this.happyPakia)){
            this.pappu.yVel = 0;
            this.gPanel.currentScreen=new GameOverScreen(gPanel);
        }

        if(this.star.isColliding(this.pappu)&&this.star.isVisible){
            this.a = true;
            this.star.isVisible=false;
            Entity.score+=100;
            if(!this.muteimage.muteOn) {
                Resources.tingAudio.play();
            }
        }

        if(this.pappu.y%2==0){
            Entity.score+=1;
        }

        if(this.berries.isColliding(this.pappu) && this.berries.isVisible) {
            this.berries.isVisible = false;
            Entity.score+= 50;
            for(Superpower s: superpappu) {
                s.isVisible = true;
                s.y = Util.randomsuperyCord();
                s.x = 36;
            }
            if(!this.muteimage.muteOn) {
                Resources.tingAudio.play();
            }
        }

        for(Superpower s: superpappu) {
            if(s.isVisible) {
//               if(s.isColliding(this.fork)) {
//                   this.fork.isVisible = false;
//               }
               for(Entity b: this.branches) {
                   if(s.isColliding(b)) {
                       b.isVisible = false;
                   }
               }
            }
        }

    }

    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Forte",Font.BOLD,40));
        g.drawString("SCORE: "+Entity.score,Entity.SCORE_X_CORD,Entity.SCORE_Y_CORD);
        if(a) {
            g.drawString("+100",Entity.SCORE_X_CORD+250,Entity.SCORE_Y_CORD);
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    a = false;
                }
            }, 1000);
        }
//        if(this.a) {
//            long endTIme = System.currentTimeMillis() + 1000;
//            while(System.currentTimeMillis() < endTIme) {
//                g.drawString("+100",200,200);
//            }
//            this.a = false;
//        }
    }

    @Override
    public void onKeyPress(int keyCode) {

        if(keyCode==KeyEvent.VK_UP){
            this.pappu.move();
            this.log.isVisible=false;
            if(!this.muteimage.muteOn) {
                Resources.flapAudio.play();
            }

            if(!this.pappu.isMoving) {
                for (Entity e : entities) {
                    e.isMoving = true;
                }
                this.happyPakia.isMoving=false;
            }

        }
    }

    @Override
    public void onKeyReleased(int keyCode) {
        if(keyCode==KeyEvent.VK_UP){
            this.pappu.isMoving=false;
        }
    }
}