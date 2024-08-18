import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class ProjectForSwing {
static BigDecimal totalPrice;
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
    public void wait(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
e.printStackTrace();        }
    }
}
