import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

public class Character {
    private BigDecimal money;
    private int age;
    private Education education;
    private char gender;
    private String name;
    private double happiness;
    private BufferedImage image;
    private Character spouse;
    private Set<Character> children;
    private int height;
    private CharacterType characterType;

    public Character(BigDecimal money, int age, Education education, char gender, String name, BufferedImage image, Character spouse,int height) {
        this.money = money;
        if (age < 18) {
            age = 18;
        }
        this.age = age;
        this.education = education;
        this.gender = gender;
        this.name = name;
        this.image = image;
        this.spouse = spouse;//dating,lover,engage,marriage,enum
        this.height=height;
        this.characterType = gender=='F'?CharacterType.TYPE2GIRL : CharacterType.TYPE1BOY;
    }

    public Character(BigDecimal money, String name, BufferedImage image) {
        this.money = money;
        this.gender = (int) (Math.random() * 2) == 1 ? 'F' : 'M';
        this.name = name;
        this.image = image;
        defineImg();
        this.characterType = gender=='F'?CharacterType.TYPE2GIRL : CharacterType.TYPE1BOY;
    }

    public Character getSpouse() {
        return spouse;
    }

    public int getHeight() {
        return height;
    }

    public void defineImg() {
        if (gender == 'F') {
            if ((int) (Math.random() * 2) == 1) {
                this.image = Entity.type1Girl5;
            } else {
                this.image = Entity.type2Girl10;
            }
        } else {
            this.image = Entity.type1Boy10;
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

    private int counter = 0;

    public void aMonthPasses() {
        if (education == null) {
            if (age > 6 && age < 17) {
                money = money.add(BigDecimal.valueOf(education.getPay()));
            }
        }
        Main.totalPrice = Main.totalPrice.add(money);
        counter++;
        if (counter == 12) {
            age++;
            counter = 0;
            if (gender == 'F') {
                if (CharacterType.TYPE2GIRL.equals(characterType)) {
                    if (age >= 5&&age<10) {
                        this.image = Entity.type2Girl5;
                    } else if (age>=10&&age<18) {
                        this.image=Entity.type2Girl10;
                    }else if (age>=18&&age<25) {
                        this.image=Entity.type2Girl18;
                    }else if (age>=25&&age<40) {
                        this.image=Entity.type2Girl25;
                    }else if (age>=40&&age<60) {
                        this.image=Entity.type2Girl40;
                    }else{
                        this.image=Entity.type2Girl60;
                    }
                }
            } else {
                if (CharacterType.TYPE1BOY.equals(characterType)) {
                    if (age >= 5&&age<10) {
                        this.image = Entity.type1Boy5;
                    } else if (age>=10&&age<18) {
                        this.image=Entity.type1Boy10;
                    }else if (age>=18&&age<25) {
                        this.image=Entity.type1Boy18;
                    }else if (age>=25&&age<40) {
                        this.image=Entity.type1Boy25;
                    }else if (age>=40&&age<60) {
                        this.image=Entity.type1Boy40;
                    }else{
                        this.image=Entity.type1Boy60;
                    }
                }
            }
            //death
            if (CharacterType.TYPE2GIRL.equals(characterType)) {
                    if (age >= 5&&age<10) {
                        this.image = Entity.type2Girl5RIP;
                    } else if (age>=10&&age<18) {
                        this.image=Entity.type2Girl10RIP;
                    }else if (age>=18&&age<25) {
                        this.image=Entity.type2Girl18RIP;
                    }else if (age>=25&&age<40) {
                        this.image=Entity.type2Girl25RIP;
                    }else if (age>=40&&age<60) {
                        this.image=Entity.type2Girl40RIP;
                    }else{
                        this.image=Entity.type2Girl60RIP;
                    }
                }

            }
        if (spouse == null && age > 18) {
            if ((int) (Math.random() * 24) == 1) {
            }
        }
        //child
        if (spouse != null) {
            //child
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return age == character.age && gender == character.gender && counter == character.counter && Objects.equals(money, character.money) && education == character.education && Objects.equals(name, character.name) && Objects.equals(image, character.image) && Objects.equals(spouse, character.spouse) && Objects.equals(children, character.children);
    }
    @Override
    public int hashCode() {
        return Objects.hash(money, age, education, gender, name, image, spouse, children, counter);
    }
}