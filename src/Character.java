import java.awt.image.BufferedImage;
import java.math.BigDecimal;

public class Character {
    private BigDecimal money;
    private int age;
    private Education education;
    private char gender;
    private String name;
    private double happiness;
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
        defineImg();
    }
    public void defineImg() {
        if(gender=='F'){
     if((int) (Math.random()*2)==1) {
         this.image=Entity.type1Girl5;
     }else {
    this.image=Entity.type2Girl10;
     }
        }
        else {
this.image=Entity.type1Boy10;
        }
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
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
            if(gender=='F'){
                if((int) (Math.random()*2)==1) {
                    if(age>5) {
                        this.image = Entity.type1Girl5;
                    }
                }else {
                    this.image=Entity.type2Girl10;
                }
            }
            else {
                this.image=Entity.type1Boy10;
            }
        }

    }

}
