public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        setHunger(getHunger() - 15);
        setHappiness(getHappiness() + 5);
        System.out.println(getName() + " enjoyed some fish 🐟");
    }

    @Override
    public void play() {
        setEnergy(getEnergy() - 10);
        setHappiness(getHappiness() + 15);
        System.out.println(getName() + " chased a laser pointer 🔴");
    }

    @Override
    public void sleep() {
        setEnergy(getEnergy() + 20);
        System.out.println(getName() + " curled up and slept 😽");
    }
}
