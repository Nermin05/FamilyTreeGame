import javax.swing.*;

import java.math.BigDecimal;

public class ProjectForSwing {
    static BigDecimal totalPrice;

    public static void main(String[] args) {
        Entity entity = new Entity();
        JFrame jFrame = new JFrame();
        ImagePanel imagePanel = new ImagePanel();

        jFrame.setSize(800, 450);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setTitle("Salam");
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.add(imagePanel);

    }
    public void wait(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
