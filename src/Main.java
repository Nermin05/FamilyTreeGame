import javax.swing.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static BigDecimal totalPrice=BigDecimal.valueOf(0);
    public static List<Character> listOfFamily=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(totalPrice);
        JFrame jFrame = new JFrame();
        ImagePanel imagePanel = new ImagePanel();

        jFrame.setSize(Entity.screenWidth, Entity.screenHeight);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setTitle("Family Tree Game");
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.add(imagePanel);

    }
    public void wait(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
