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
    public static BufferedImage boy0RIP;
    public static BufferedImage girl0RIP;
    public static BufferedImage type1Boy5RIP;
    public static BufferedImage type1Boy10RIP;
    public static BufferedImage type1Boy18RIP;
    public static BufferedImage type1Boy25RIP;
    public static BufferedImage type1Boy40RIP;
    public static BufferedImage type1Boy60RIP;
    public static BufferedImage type1Girl5RIP;
    public static BufferedImage type1Girl18RIP;
    public static BufferedImage type1Girl40RIP;
    public static BufferedImage type1Girl60RIP;
    public static BufferedImage type2Girl5RIP;
    public static BufferedImage type2Girl10RIP;
    public static BufferedImage type2Girl18RIP;
    public static BufferedImage type2Girl25RIP;
    public static BufferedImage type2Girl40RIP;
    public static BufferedImage type2Girl60RIP;

    static {
        try {
            background = ImageIO.read(new File("src\\assets\\Other\\Background.png"));
            nameBlock = ImageIO.read(new File("src\\assets\\Other\\NameBlock.png"));
            boy0 = ImageIO.read(new File("src\\assets\\Babies\\Boy0.png"));
            girl0 = ImageIO.read(new File("src\\assets\\Babies\\Girl0.png"));
            type1Boy5 = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy5.png"));
            type1Boy10 = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy10.png"));
            type1Boy18 = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy18.png"));
            type1Boy25 = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy25.png"));
            type1Boy40 = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy40.png"));
            type1Boy60 = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy60.png"));
            type1Girl5 = ImageIO.read(new File("src\\assets\\Type1Girl\\Type1Girl5.png"));
            type1Girl18 = ImageIO.read(new File("src\\assets\\Type1Girl\\Type1Girl18.png"));
            type1Girl40 = ImageIO.read(new File("src\\assets\\Type1Girl\\Type1Girl40.png"));
            type1Girl60 = ImageIO.read(new File("src\\assets\\Type1Girl\\Type1Girl60.png"));
            type2Girl5 = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl5.png"));
            type2Girl10 = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl10.png"));
            type2Girl18 = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl18.png"));
            type2Girl25 = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl25.png"));
            type2Girl40 = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl40.png"));
            type2Girl60 = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl60.png"));
            boy0RIP = ImageIO.read(new File("src\\assets\\Babies\\Boy0RIP.png"));
            girl0RIP = ImageIO.read(new File("src\\assets\\Babies\\Girl0RIP.png"));
            type1Boy5RIP = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy5RIP.png"));
            type1Boy10RIP = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy10RIP.png"));
            type1Boy18RIP = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy18RIP.png"));
            type1Boy25RIP = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy25RIP.png"));
            type1Boy40RIP = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy40RIP.png"));
            type1Boy60RIP = ImageIO.read(new File("src\\assets\\Type1Boy\\Type1Boy60RIP.png"));
            type1Girl5RIP = ImageIO.read(new File("src\\assets\\Type1Girl\\Type1Girl5RIP.png"));
            type1Girl18RIP = ImageIO.read(new File("src\\assets\\Type1Girl\\Type1Girl18RIP.png"));
            type1Girl40RIP = ImageIO.read(new File("src\\assets\\Type1Girl\\Type1Girl40RIP.png"));
            type1Girl60RIP = ImageIO.read(new File("src\\assets\\Type1Girl\\Type1Girl60RIP.png"));
            type2Girl5RIP = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl5RIP.png"));
            type2Girl10RIP = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl10RIP.png"));
            type2Girl18RIP = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl18RIP.png"));
            type2Girl25RIP = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl25RIP.png"));
            type2Girl40RIP = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl40RIP.png"));
            type2Girl60RIP = ImageIO.read(new File("src\\assets\\Type2Girl\\Type2Girl60RIP.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
