import java.awt.image.BufferedImage;
import java.math.BigDecimal;

public class Character {
    private BigDecimal money;
    private int age;
    private Education education;
    private final char gender;
    private final String name;
    private BufferedImage image;
    private Character spouse;

    public Character(BigDecimal money, int age, Education education, char gender, String name, BufferedImage image,Character spouse) {
        this.money = money;
        if(age<18) {
            age=18;
        }
        this.age = age;
        this.education = education;
        this.gender = gender;
        this.name = name;
        this.image = image;
        this.spouse=spouse;
    }

    public Character(BigDecimal money, String name, BufferedImage image) {
        this.money = money;
        this.gender = (int)(Math.random()*2)==1?'F':'M';
        this.name = name;
        this.image = image;
    }
    public void defineImg() {
        if(gender=='F'){

        }
        else {

        }
    }

    public BigDecimal getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }

private int counter=0;
    public void aMonthPasses() {

        if (education == null) {
            if (age > 6 && age < 17) {
                //ask user
                money.add(BigDecimal.valueOf(education.getPay()));
            }
        }
        ProjectForSwing.totalPrice.add(money);
        counter++;
        if(counter==12) {
            age++;
            counter=0;
        }

    }

}
