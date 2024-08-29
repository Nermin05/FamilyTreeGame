import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class ImagePanel extends JPanel implements Runnable {
    private Point initialClick;
    private Thread thread;
    private int imgX, imgY,xMoved,yMoved,lastX,lastY;
    public ImagePanel() {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                lastX=imgX;
                lastY=imgY;
            }
            @Override
            public void mouseDragged(MouseEvent e) {
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                 xMoved = lastX+(e.getX() - initialClick.x);
                 yMoved = lastY+(e.getY() - initialClick.y);

                imgX = thisX + xMoved;
                imgY = thisY + yMoved;
                setLocation(0, 0);
            }
        };
        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                g.drawImage(Entity.background, i * 150, j * 150, 150, 150, this);
            }
        }
        int x = imgX + (getWidth() / 2 - (Main.mainChar.getSpouse() == null ? Entity.imgDiameter / 2 : Entity.imgDiameter));
        int y = imgY + Main.mainChar.getHeight() * 200;
        g.drawImage(Main.mainChar.getImage(), x, y, Entity.imgDiameter, Entity.imgDiameter, this);
    }

    public void gameStart() {
        thread = new Thread(this);
        thread.start();
    }

    private int update() {
        return 0;
    }

    @Override
    public void run() {
        while (thread != null) {
            try {
                Thread.sleep(1000 / 60);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            repaint();
        }
    }
}
