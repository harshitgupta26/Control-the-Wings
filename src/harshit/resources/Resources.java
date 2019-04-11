package harshit.resources;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

public class Resources {
    public static Image frontTreesImage;
    public static Image cloudImage;
    public static Image pappuImage1;
    public static Image pappuImage2;
    public static Image pappuImage3;
    public static Image pappuImage4;
    public static Image pappuImage5;
    public static Image groundImage;
    public static Image backTreeImage;
    public static Image logImage;
    public static Image standImage;
    public static Image plank1Image;
    public static Image plank2Image;
    public static Image plank3Image;
    public static Image backGroundImage;
    public static Image branchImage;
    public static Image forkHandle;
    public static Image forkHead;
    public static Image happypakiaImage;
    public static Image starImage;
    public static Image controlsImage;
    public static Image muteOnImage;
    public static Image muteOffImage;
    public static Image berriesImage;
    public static Image invertedforkImage;

    public static AudioClip flapAudio;
    public static AudioClip pappuJump;
    public static AudioClip pakiaJumpAudio;
    public static AudioClip pakiaJump2Audio;
    public static AudioClip backGroundMusic;
    public static AudioClip tingAudio;

    public static Color skyColor;

    public static void load() {
        skyColor = new Color(91, 198, 255);

        try {
            frontTreesImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/front_trees.png"));
            backTreeImage=ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/back_trees.png"));

            logImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/log.png"));

            backGroundImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/bg_combined.png"));

            happypakiaImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/happy_pakia.png"));

            branchImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/branch.png"));
            standImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/stand.png"));

            plank1Image = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/plank_top.png"));
            plank2Image = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/plank_mid.png"));
            plank3Image = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/plank_bot.png"));

            cloudImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/clouds.png"));

            pappuImage1 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/pappu2.png"));
            pappuImage2 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/pappu3.png"));
            pappuImage3 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/pappu4.png"));
            pappuImage4 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/pappu5.png"));
            pappuImage5 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/pappu6.png"));

            groundImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/ground.png"));

            forkHandle = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/fork.png"));
            invertedforkImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/inverted_fork.png"));
//            forkHead = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/fork_head.png"));
//
            starImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/star.png"));
            berriesImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/berries.png"));

            controlsImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/controls.png"));
            muteOnImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/muteon.png"));
            muteOffImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("harshit/resources/images/muteoff.png"));
    //AUDIOS
            flapAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("harshit/resources/audios/flap.wav"));
            pappuJump = Applet.newAudioClip(Resources.class.getClassLoader().getResource("harshit/resources/audios/jump1.wav"));
            pakiaJumpAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("harshit/resources/audios/jump2.wav"));
//            pakiaJump2Audio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("harshit/resources/audios/jump3.mp3"));
            backGroundMusic = Applet.newAudioClip(Resources.class.getClassLoader().getResource("harshit/resources/audios/background2.wav"));
            tingAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("harshit/resources/audios/ting.wav"));

        } catch (IOException e) {

        }
    }
}