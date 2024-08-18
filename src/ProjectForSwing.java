import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectForSwing {

    public static void main(String[] args) {
       JFrame jFrame=new JFrame();
       jFrame.setSize(400,200);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //  jFrame.setResizable(false);
      jFrame.setTitle("Salam");
      jFrame.setLocationRelativeTo(null);
      jFrame.setVisible(true);
      JLabel jLabel=new JLabel("Hello World",SwingConstants.CENTER);
        jFrame.add(jLabel);
    }
}
