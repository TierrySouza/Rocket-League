package RocketLeague;

public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("Civic", "Blue", "Zomba", "Interistellar", "Supernova");
        
        Car car2 = new Car("Skyline", "Blue", "Zomba", "Interistellar", "Supernova");
        
        Car car3 = new Car("Octane", "Red", "Zomba", "Interistellar", "Supernova");

        Car car4 = new Car("Dominous", "Red", "Zomba", "Interistellar", "Supernova");

        Game match = new Game(300, 0, 0, car1, car2, car3, car4);
        
        System.out.println();
    }
}