import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static BigDecimal totalPrice=BigDecimal.valueOf(0);
    public static Character mainChar=new Character(BigDecimal.valueOf(548),18,Education.DO_NOT_GO_UNIVERSITY,(int)(Math.random()*2)==1?'F':'M',null,0);
    public static List<Character> characterList=new ArrayList<>();
    public static ImagePanel imagePanel = new ImagePanel();
    public static boolean gameIsFlow=true;
    public static Thread threadForCharacter=new Thread(()->{
        while (gameIsFlow) {
            try {
                Thread.sleep(5000);
                Main.characterList.forEach(Character::aMonthPasses);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    });
    public static void main(String[] args) {
        characterList.add(mainChar);
        JFrame jFrame = new JFrame();

        jFrame.setSize(Entity.screenWidth, Entity.screenHeight);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setTitle("Family Tree Game");
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.add(imagePanel);

        imagePanel.gameStart();

        threadForCharacter.start();
    }
}
