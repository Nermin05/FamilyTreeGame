import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    final int originalTileSize=16;
    final int scale=3;
    final int tileSize=originalTileSize*scale;
    final int maxScreenCol=16;
    final int rowScreenCol=12;
    final int screenWidth=tileSize*maxScreenCol;
    final int screenHeight=tileSize*rowScreenCol;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
    }
}
