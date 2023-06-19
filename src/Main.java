public class Main {
    public static void main(String[] args) {

        House house = new House.Builder()
                .bedrooms(4)
                .floors(2)
                .bathrooms(3)
                .hasGarden(true)
                .hasGarage(false)
                .build();

        System.out.println("Bedrooms: " + house.getBedrooms());
        System.out.println("Floors: " + house.getFloors());
        System.out.println("Bathrooms: " + house.getBathrooms());
        System.out.println("Has Garden: " + house.hasGarden());
        System.out.println("Has Garage: " + house.hasGarage());

    }
}
