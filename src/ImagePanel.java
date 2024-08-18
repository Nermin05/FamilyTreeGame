import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Character character=new Character();
        g.drawImage(Entity.type1Girl5, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
