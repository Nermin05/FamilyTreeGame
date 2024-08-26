import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Entity {
    public static int imgDiameter = 150;
    public static int screenWidth = 1000;
    public static int screenHeight = 750;
    public static BufferedImage background;
    public static BufferedImage nameBlock;
    public static BufferedImage boy0;
    public static BufferedImage girl0;
    public static BufferedImage type1Boy5;
    public static BufferedImage type1Boy10;
    public static BufferedImage type1Boy18;
    public static BufferedImage type1Boy25;
    public static BufferedImage type1Boy40;
    public static BufferedImage type1Boy60;
    public static BufferedImage type1Girl5;
    public static BufferedImage type1Girl18;
    public static BufferedImage type1Girl40;
    public static BufferedImage type1Girl60;
    public static BufferedImage type2Girl5;
    public static BufferedImage type2Girl10;
    public static BufferedImage type2Girl18;
    public static BufferedImage type2Girl25;
    public static BufferedImage type2Girl40;
    public static BufferedImage type2Girl60;

    static {
        try {
            background = ImageIO.read(new File("src\\assets\\Background.png"));
            nameBlock = ImageIO.read(new File("src\\assets\\NameBlock.png"));
            boy0 = ImageIO.read(new File("src\\assets\\Boy0.png"));
            girl0 = ImageIO.read(new File("src\\assets\\Girl0.png"));
            type1Boy5 = ImageIO.read(new File("src\\assets\\Type1Boy5.png"));
            type1Boy10 = ImageIO.read(new File("src\\assets\\Type1Boy10.png"));
            type1Boy18 = ImageIO.read(new File("src\\assets\\Type1Boy18.png"));
            type1Boy25 = ImageIO.read(new File("src\\assets\\Type1Boy25.png"));
            type1Boy40 = ImageIO.read(new File("src\\assets\\Type1Boy40.png"));
            type1Boy60 = ImageIO.read(new File("src\\assets\\Type1Boy60.png"));
            type1Girl5 = ImageIO.read(new File("src\\assets\\Type1Girl5.png"));
            type1Girl18 = ImageIO.read(new File("src\\assets\\Type1Girl18.png"));
            type1Girl40 = ImageIO.read(new File("src\\assets\\Type1Girl40.png"));
            type1Girl60 = ImageIO.read(new File("src\\assets\\Type1Girl60.png"));
            type2Girl5 = ImageIO.read(new File("src\\assets\\Type2Girl5.png"));
            type2Girl10 = ImageIO.read(new File("src\\assets\\Type2Girl10.png"));
            type2Girl18 = ImageIO.read(new File("src\\assets\\Type2Girl18.png"));
            type2Girl25 = ImageIO.read(new File("src\\assets\\Type2Girl25.png"));
            type2Girl40 = ImageIO.read(new File("src\\assets\\Type2Girl40.png"));
            type2Girl60 = ImageIO.read(new File("src\\assets\\Type2Girl60.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
