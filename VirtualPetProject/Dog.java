public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        setHunger(getHunger() - 20);
        setEnergy(getEnergy() + 10);
        System.out.println(getName() + " ate happily! 🦴");
    }

    @Override
    public void play() {
        setEnergy(getEnergy() - 15);
        setHappiness(getHappiness() + 25);
        System.out.println(getName() + " played fetch! 🎾");
    }

    @Override
    public void sleep() {
        setEnergy(getEnergy() + 30);
        System.out.println(getName() + " is sleeping... 💤");
    }
}