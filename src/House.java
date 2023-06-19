public class House {
    private final int bedrooms;
    private final int floors;
    private final int bathrooms;
    private final boolean hasGarden;
    private final boolean hasGarage;

    private House(int bedrooms, int floors, int bathrooms, boolean hasGarden, boolean hasGarage) {
        this.bedrooms = bedrooms;
        this.floors = floors;
        this.bathrooms = bathrooms;
        this.hasGarden = hasGarden;
        this.hasGarage = hasGarage;
    }

    // Getters
    public int getBedrooms() {
        return bedrooms;
    }

    public int getFloors() {
        return floors;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    // Builder class

    public static class Builder {
        private int bedrooms;
        private int floors;
        private int bathrooms;
        private boolean hasGarden;
        private boolean hasGarage;

        public Builder bedrooms(int bedrooms) {
            this.bedrooms = bedrooms;
            return this;
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder bathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
            return this;
        }

        public Builder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(bedrooms, floors, bathrooms, hasGarden, hasGarage);
        }
    }
}
