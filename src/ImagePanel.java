import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int diameter = 100;
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;

        // Cast to Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Draw the thick black border circle
        g2.setColor(Color.BLACK);  // Set the color to black
        g2.setStroke(new BasicStroke(5));  // Set the stroke thickness to 5 pixels
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, diameter, diameter);
        g2.draw(circle);  // Draw the outline of the circle

        // Set the clip to the circle for the image
        g2.setClip(circle);

        // Draw the image inside the clipped circle
        g2.drawImage(Entity.type1Girl5, x, y, diameter, diameter, this);
    }
}
