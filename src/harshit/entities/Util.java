package harshit.entities;

import java.util.Random;

public class Util {

    private static Random r1=new Random();

    private Util(){

    }

    private static int x;
    private static int y;
    private static int rycord;
    private static int z;
    private static int a;
    private static int berrycord;

    public static int randompakiaCord(){
        x=(Util.r1.nextInt(3))*100+300;
        return (x);
    }

    public static int randomsuperyCord(){
        rycord=Util.r1.nextInt(450);
        return(rycord);
    }

//    public static int randombranchxCord(){
//        x=Util.r1.nextInt(3);
//        return x*500+800;
//    }
//    public static int randomForkXCord() {
//        return (Util.r1.nextInt(3)*500+1000);
//    }

    public static int randomStarYCord(){
        y=(Util.r1.nextInt(3));
        return(y*100);
    }

    public static int randomBerryYCord(){
        berrycord=(Util.r1.nextInt(3));
        return(berrycord*100+100);
    }
    public static int randomBerryXCord() {
        return (Util.r1.nextInt(5)*1000+400);
    }

    public static int happypakiaVisible(){
        z=Util.r1.nextInt(75);
        return z;
    }

    public static int pakiayAcc(){
        a=Util.r1.nextInt(2);
        return a+1;
    }

    public static int randomStarXCord() {
        return (Util.r1.nextInt(3)*200+850);
    }



}
