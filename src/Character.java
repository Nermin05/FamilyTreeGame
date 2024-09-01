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
    private BufferedImage image;
    private Character spouse;
    private Set<Character> children;
    private int height;
    private CharacterType characterType;

    public Character(BigDecimal money, int age, Education education, char gender, Character spouse, int height) {
        this.money = money;
        if (age < 18) {
            age = 18;
        }
        this.age = age;
        this.education = education;
        this.gender = gender;
        this.name = gender=='F'?"Olivia":"Baki";
        this.spouse = spouse;//dating,lover,engage,marriage,enum
        this.height = height;
        this.characterType = gender == 'F' ? CharacterType.TYPE2GIRL : CharacterType.TYPE1BOY;
        defineImg();
    }

    public Character(BigDecimal money) {
        this.money = money;
        this.gender = (int) (Math.random() * 2) == 1 ? 'F' : 'M';
        this.name =gender=='F'?"Olivia":"Baki";
        this.characterType = gender == 'F' ? CharacterType.TYPE2GIRL : CharacterType.TYPE1BOY;
        defineImg();
    }

    public Character getSpouse() {
        return spouse;
    }

    public int getHeight() {
        return height;
    }

    public void defineImg() {
        if (gender == 'F') {
            if (CharacterType.TYPE2GIRL.equals(characterType)) {
                if (age < 5) {
                    this.image=Entity.girl0;
                } else {
                    setImgForAgeBoy();
                }
            }
        } else {
            if (CharacterType.TYPE1BOY.equals(characterType)) {
                if (age < 5) {
                    this.image=Entity.boy0;
                } else {
                    setImgForAgeGirl();
                }
            }
        }
    }

    private void setImgForAgeGirl() {
        if (age >= 5 && age < 10) {
            this.image = Entity.type1Boy5;
        } else if (age >= 10 && age < 18) {
            this.image = Entity.type1Boy10;
        } else if (age >= 18 && age < 25) {
            this.image = Entity.type1Boy18;
        } else if (age >= 25 && age < 40) {
            this.image = Entity.type1Boy25;
        } else if (age >= 40 && age < 60) {
            this.image = Entity.type1Boy40;
        } else {
            this.image = Entity.type1Boy60;
        }
    }

    private void setImgForAgeBoy() {
        if (age >= 5 && age < 10) {
            this.image = Entity.type2Girl5;
        } else if (age >= 10 && age < 18) {
            this.image = Entity.type2Girl10;
        } else if (age >= 18 && age < 25) {
            this.image = Entity.type2Girl18;
        } else if (age >= 25 && age < 40) {
            this.image = Entity.type2Girl25;
        } else if (age >= 40 && age < 60) {
            this.image = Entity.type2Girl40;
        } else {
            this.image = Entity.type2Girl60;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
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
                Main.gameIsFlow = false;


                Main.gameIsFlow = true;
                Main.threadForCharacter.start();
            }
        }
        Main.totalPrice = Main.totalPrice.add(money);
        counter++;
        if (counter == 12) {
            age++;
            counter = 0;
            if (gender == 'F') {
                if (CharacterType.TYPE2GIRL.equals(characterType)) {
                    setImgForAgeBoy();
                }
            } else {
                if (CharacterType.TYPE1BOY.equals(characterType)) {
                    setImgForAgeGirl();
                }
            }
            //death
            if (CharacterType.TYPE2GIRL.equals(characterType)) {
                if (age >= 5 && age < 10) {
                    this.image = Entity.type2Girl5RIP;
                } else if (age >= 10 && age < 18) {
                    this.image = Entity.type2Girl10RIP;
                } else if (age >= 18 && age < 25) {
                    this.image = Entity.type2Girl18RIP;
                } else if (age >= 25 && age < 40) {
                    this.image = Entity.type2Girl25RIP;
                } else if (age >= 40 && age < 60) {
                    this.image = Entity.type2Girl40RIP;
                } else {
                    this.image = Entity.type2Girl60RIP;
                    if ((int) (Math.random() * 200) < age) {
                        if (gender == 'F') {
                            if (CharacterType.TYPE2GIRL.equals(characterType)) {
                                if (age >= 5 && age < 10) {
                                    this.image = Entity.type2Girl5RIP;
                                } else if (age >= 10 && age < 18) {
                                    this.image = Entity.type2Girl10RIP;
                                } else if (age >= 18 && age < 25) {
                                    this.image = Entity.type2Girl18RIP;
                                } else if (age >= 25 && age < 40) {
                                    this.image = Entity.type2Girl25RIP;
                                } else if (age >= 40 && age < 60) {
                                    this.image = Entity.type2Girl40RIP;
                                } else {
                                    this.image = Entity.type2Girl60RIP;
                                }
                            }
                        } else {
                            if (CharacterType.TYPE1BOY.equals(characterType)) {
                                if (age >= 5 && age < 10) {
                                    this.image = Entity.type1Boy5RIP;
                                } else if (age >= 10 && age < 18) {
                                    this.image = Entity.type1Boy10RIP;
                                } else if (age >= 18 && age < 25) {
                                    this.image = Entity.type1Boy18RIP;
                                } else if (age >= 25 && age < 40) {
                                    this.image = Entity.type1Boy25RIP;
                                } else if (age >= 40 && age < 60) {
                                    this.image = Entity.type1Boy40RIP;
                                } else {
                                    this.image = Entity.type1Boy60RIP;
                                }
                            }
                        }
                    }
                }
                if (spouse == null && age > 18) {
                    if ((int) (Math.random() * 24) == 1) {
                        ImagePanel.askQuestion = true;
                        Main.gameIsFlow = false;

                        int age = this.age + (int) (Math.random() * 8) - 4;
                        Education education = (int) (Math.random() * 2) == 1 ? Education.DO_NOT_GO_SCHOOL : Education.GRADUATED;
                        char gender = this.gender == 'F' ? 'M' : 'F';

                        double happiness = 100;
                        Character spouse = this;
                        int height = this.height;
                        BigDecimal money = BigDecimal.valueOf(height * 100L + education.getPay() + 200);

                        //ask
//                if (answerIsTrue) {
//                    this.spouse = new Character(money, age, education, gender, spouse, height);
//                    Main.characterList.add(this.spouse);
//                }

                        Main.gameIsFlow = true;
                        Main.threadForCharacter.start();
                    }
                }
                //child
                if (spouse != null && age < 40 && this.spouse.age < 40) {
                    if ((int) (Math.random() * this.age - 5) == 1) {
                        ImagePanel.askQuestion = true;
                        Main.gameIsFlow = false;

                        BigDecimal money = BigDecimal.valueOf(-(height * 100L + 200));
                        String name = gender == 'F' ? "Olivia" : "Baki";


//                 ask
//                if (answerIsTrue) {
//                   Character child=new Character(money);
//                    this.children.add( child);
//                    this.spouse.children.add(child);
//                    Main.characterList.add(this.spouse);
//                }

                        Main.gameIsFlow = true;
                        Main.threadForCharacter.start();
                    }
                }
            }
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