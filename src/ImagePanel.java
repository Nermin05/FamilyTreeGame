import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class ImagePanel extends JPanel implements Runnable {
    private Point initialClick;
    private Thread thread;
    private int counter;
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
                counter = thisX + xMoved;
                //int Y = thisY + yMoved;
                setLocation(0, 0);
            }
        };

        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
    }
    private int x;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                g.drawImage(Entity.background, i * 150, j * 150, 150, 150, this);
            }
        }
        x = Main.mainChar.getSpouse() == null ? counter+(getWidth() - Entity.imgDiameter) / 2 : counter+getWidth() / 2 - Entity.imgDiameter;
        int y = Main.mainChar.getHeight() * 200;
        g.drawImage(Main.mainChar.getImage(), x, y, Entity.imgDiameter, Entity.imgDiameter, this);

    }

    public void gameStart() {
        thread = new Thread(this);
        thread.start();
    }
    private int update(){
        return 0;
    }
    @Override
    public void run() {
        while (thread != null) {
            try{
                Thread.sleep(1000/60);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            repaint();
        }
    }
}
