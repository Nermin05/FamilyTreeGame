import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Entity {

    public static BufferedImage type1Girl5;

    public Entity() {
        try {
            type1Girl5 =ImageIO.read(new File("src\\assets\\fiveGirlSari.png"));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
