import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i=0;i<15;i++){
            for (int j = 0; j < 15; j++) {
                g.drawImage(Entity.background, i*74, j*74, 74, 74, this);
            }
        }
        int x = Main.mainChar.getSpouse()==null?(getWidth() - Entity.imgDiameter) / 2:getWidth()/2-Entity.imgDiameter;
        int y = Main.mainChar.getHeight()*200;
        g.drawImage(Main.mainChar.getImage(), x, y, Entity.imgDiameter, Entity.imgDiameter, this);


        // Cast to Graphics2D
        //Graphics2D g2 = (Graphics2D) g;

        // Draw the thick black border circle
        //g2.setColor(Color.BLACK);  // Set the color to black
        //g2.setStroke(new BasicStroke(5));  // Set the stroke thickness to 5 pixels
        //Ellipse2D.Double circle = new Ellipse2D.Double(x, y, diameter, diameter);
        //g2.draw(circle);  // Draw the outline of the circle

        // Set the clip to the circle for the image
        //g2.setClip(circle);

        // Draw the image inside the clipped circle
        //g2.drawImage(Entity.type1Girl5, x, y, diameter, diameter, this);
    }
}
