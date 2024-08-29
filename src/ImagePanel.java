import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImagePanel extends JPanel implements Runnable {
    private Point initialClick;
    private Thread thread;
    private int imgX, imgY;
    private final double speedFactor = 0.01;

    public ImagePanel() {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int thisX = imgX;
                int thisY = imgY;

                int xMoved = (int) ((e.getX() - initialClick.x) * speedFactor);
                int yMoved = (int) ((e.getY() - initialClick.y) * speedFactor);

                imgX = thisX + xMoved;
                imgY = thisY + yMoved;
                repaint();
            }
        };

        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Arkaplanı çiz
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
