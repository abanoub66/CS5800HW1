package PolymorphismShips;

public class CargoShip extends Ship {

    private int cargoCapacityInTons;

    public CargoShip(String name, String yearBuilt, int cargoCapacityInTons) {
        super(name, yearBuilt);
        this.cargoCapacityInTons = cargoCapacityInTons;
    }

    public int getCargoCapacityInTons() {
        return cargoCapacityInTons;
    }

    public void setCargoCapacityInTons(int cargoCapacityInTons) {
        this.cargoCapacityInTons = cargoCapacityInTons;
    }

    @Override
    public String toString() {
        return name + " " +cargoCapacityInTons;
    }
}
