import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImagePanel extends JPanel implements Runnable {
    private Point initialClick;
    private Thread thread;
    private int imgX, imgY, xMoved, yMoved, lastX, lastY;
    public static boolean askQuestion = true;
    public String askString = "Information";
    private JButton yesButton;
    private JButton noButton;

    public ImagePanel() {
        setLayout(null);

        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                lastX = imgX;
                lastY = imgY;
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                xMoved = lastX + (e.getX() - initialClick.x);
                yMoved = lastY + (e.getY() - initialClick.y);

                imgX = thisX + xMoved;
                imgY = thisY + yMoved;
                setLocation(0, 0);
            }
        };
        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);

        yesButton = new JButton("Yes");
        yesButton.setBounds(230, 500, 200, 70);
        yesButton.setFont(new Font("Arial", Font.PLAIN, 20));
        yesButton.setOpaque(false);
        yesButton.setContentAreaFilled(false);
        yesButton.setBorderPainted(false);
        yesButton.setFocusPainted(false);
        yesButton.addActionListener(e -> {
//            askQuestion = false;
        });

        noButton = new JButton("No");
        noButton.setBounds(570, 500, 200, 70);
        noButton.setFont(new Font("Arial", Font.PLAIN, 20));
        noButton.setOpaque(false);
        noButton.setContentAreaFilled(false);
        noButton.setBorderPainted(false);
        noButton.setFocusPainted(false);
        noButton.addActionListener(e -> {
//            askQuestion = false;
            
        });

        yesButton.setVisible(false);
        noButton.setVisible(false);

        add(yesButton);
        add(noButton);
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
        Main.characterList.forEach(character -> {
            g.drawImage(character.getImage(), x, character.getHeight() * 190 + y, Entity.imgDiameter, Entity.imgDiameter, this);
        });

        g.setFont(new Font("Arial", Font.PLAIN, 25));
        g.setColor(Color.white);
        g.drawString("$" + Main.totalPrice.toString(), 950 - Main.totalPrice.toString().length() * 14, 40);

        g.drawImage(Main.mainChar.getImage(), x, y, Entity.imgDiameter, Entity.imgDiameter, this);

        if (askQuestion) {
            ask(g, askString);
            yesButton.setVisible(true);
            noButton.setVisible(true);
        } else {
            yesButton.setVisible(false);
            noButton.setVisible(false);
        }
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

    public void ask(Graphics g, String s) {
        g.drawImage(Entity.whiteBackgroundBigFrame, 150, 150, 700, 450, this);
        g.setColor(Color.BLACK);
        for (int i = 0; i < s.length() / 51 + 1; i++) {
            int startIdx = i * 51;
            int endIdx = Math.min((i + 1) * 51, s.length());
            g.drawString(s.substring(startIdx, endIdx), 170, i * 35 + 190);
        }

        g.drawImage(Entity.initialButton, 230, 500, 200, 70, this);
        g.drawImage(Entity.pushedButton, 570, 500, 200, 70, this);
    }
}
