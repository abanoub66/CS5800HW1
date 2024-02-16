package PolymorphismShips;

public class ShipDriver {

    public static void main(String[] args) {
        Ship[] ships = initializeShips();
        displayShips(ships);
    }

    private static Ship[] initializeShips() {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("fee", "1976");
        ships[1] = new CruiseShip("fie", "1980", 200000);
        ships[2] = new CargoShip("foe", "1984", 25);
        return ships;
    }

    private static void displayShips(Ship[] ships) {
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
