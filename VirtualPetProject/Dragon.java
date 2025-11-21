public class Dragon extends Pet {

    public Dragon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        setHunger(getHunger() - 30);
        System.out.println(getName() + " devoured a cow 🐮🔥");
    }

    @Override
    public void play() {
        setEnergy(getEnergy() - 25);
        setHappiness(getHappiness() + 40);
        System.out.println(getName() + " flew through the sky! 🐉");
    }

    @Override
    public void sleep() {
        setEnergy(getEnergy() + 50);
        setHunger(getHunger() + 10);
        System.out.println(getName() + " slept on a mountain 🏔️");
    }
}
