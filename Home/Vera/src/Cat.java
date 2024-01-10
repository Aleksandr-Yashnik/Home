public class Cat extends Pet implements Groomable{
    private String fellColour;
    private String race;
    private String name;
    private int age;

    public Cat(String fellColour, String race) {
        this.fellColour = fellColour;
        this.race = race;
    }

    public void setAge(int catAge) {
        if (catAge < 0 || catAge <= 30) {
            age = catAge;
        } else {
            System.out.println("Коты столько не живут");
        }

    }
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("мяу-мяу");
        System.out.println();
    }

    @Override
    public void play(String toy) {
        super.play(toy);
        System.out.printf("Запускай %s, %s проснется. Cмотри, уже играет", toy, name);
        System.out.println();
        notSleepsPet = true;
        System.out.println();
    }

    public void groom(){
        System.out.printf("Много шерсти. Давай вычешем %s", name);
        System.out.println();
        System.out.println();
    }
    public void sleep() {
        super.sleep();
        System.out.println();
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if (notSleepsPet) {
            System.out.printf("%s хочет есть. Насыпь корм", name);
        } else {
            System.out.printf("%s не будет есть, он спит", name);
        }
        System.out.println();
        System.out.println();
    }

    public void setName(String catName) {
        name = catName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            return false;
        }
        if (obj instanceof Cat) {
            Cat cat2 = (Cat) obj;
            return (this.race.equals(cat2.race));
        } else {
            return false;
        }
    }
    public void showInfo() {
        System.out.printf("Это %s. Ему %d лет(года), это кот породы %s  у него цвет шерсти %s", this.name, this.age,
                this.race, this.fellColour);
        System.out.println();
    }


}
