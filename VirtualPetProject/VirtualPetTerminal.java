import java.util.Scanner;

public class VirtualPetTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pet pet = null;

        System.out.println("🐾 Welcome to Terminal Virtual Pet!");

        // Choose pet
        System.out.println("Choose your pet: 1. Dog  2. Cat  3. Dragon");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Give your pet a name: ");
        String name = scanner.nextLine();

        switch (choice) {
            case 1: pet = new Dog(name); break;
            case 2: pet = new Cat(name); break;
            case 3: pet = new Dragon(name); break;
            default:
                System.out.println("Invalid choice. Defaulting to Dog.");
                pet = new Dog(name);
        }

        int action = 0;

        while (action != 4) {
            // Show pet status
            System.out.println("\n🐾 " + pet.getName() + "'s Status:");
            System.out.println("Hunger: " + pet.getHunger() + " 🍖");
            System.out.println("Energy: " + pet.getEnergy() + " ⚡");
            System.out.println("Happiness: " + pet.getHappiness() + " 😄");

            // Menu
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Exit");

            System.out.print("Your choice: ");
            action = scanner.nextInt();

            switch (action) {
                case 1:
                    pet.eat();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    System.out.println("👋 Bye! Thanks for playing.");
                    break;
                default:
                    System.out.println("❌ Invalid choice!");
            }
        }

        scanner.close();
    }
}
