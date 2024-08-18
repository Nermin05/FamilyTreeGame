import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectForSwing {

    public static void main(String[] args) {
        Entity entity=new Entity();
        JFrame jFrame = new JFrame();
        ImagePanel imagePanel=new ImagePanel();

        jFrame.setSize(800, 450);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setTitle("Salam");
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.add(imagePanel);

    }

}
