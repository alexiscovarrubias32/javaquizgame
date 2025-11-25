public abstract class Pet {

    private String name;
    private int hunger;
    private int energy;
    private int happiness;

    public Pet(String name) {
        this.name = name;
        this.hunger = 50;
        this.energy = 50;
        this.happiness = 50;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHappiness() {
        return happiness;
    }

    protected void setHunger(int hunger) {
        this.hunger = Math.max(0, Math.min(100, hunger));
    }

    protected void setEnergy(int energy) {
        this.energy = Math.max(0, Math.min(100, energy));
    }

    protected void setHappiness(int happiness) {
        this.happiness = Math.max(0, Math.min(100, happiness));
    }


    // OOP Polymorphism - each pet behaves differently
    public abstract void eat();
    public abstract void play();
    public abstract void sleep();
}