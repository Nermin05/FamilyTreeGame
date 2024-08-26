import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class ImagePanel extends JPanel {
    private Point initialClick;

    public ImagePanel() {
        // Add mouse listeners to enable dragging of the panel
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // Get the current location of the panel
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                // Determine how much the mouse moved since the initial click
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                // Move the panel to its new location
                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                setLocation(X, Y);
            }
        };

        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int diameter = 100;
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;

        // Cast to Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(5));  // Set the stroke thickness to 5 pixels
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, diameter, diameter);
        g2.draw(circle);  // Draw the outline of the circle

        // Set the clip to the circle for the image
        g2.setClip(circle);

        // Draw the image inside the clipped circle
        g2.drawImage(Entity.type1Girl5, x, y, diameter, diameter, this);
    }
}
