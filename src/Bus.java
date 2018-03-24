public class Bus extends Car {

    private int seatNumber, standingPlaces;
    private double lenght, height;

    public Bus(String brand, String model, String color,
               int power, int engineCapasity, double fuelConsumtion,
               String registrationNumber, int seatNumber, int standingPlaces, double lenght, double height) {
        super(brand, model, color, power, engineCapasity, fuelConsumtion, registrationNumber);
        this.seatNumber = seatNumber;
        this.standingPlaces=standingPlaces;
        this.lenght= lenght;
        this.height = height;
    }
    public Bus(CarDataWrapper carDataWrapper, int seatNumber, int standingPlaces, double lenght, double height) {
        super(carDataWrapper);
        this.seatNumber = seatNumber;
        this.standingPlaces=standingPlaces;
        this.lenght= lenght;
        this.height = height;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public double getLenght() {
        return lenght;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString()+
                " ,seatNumber=" + seatNumber +
                ", standingPlaces=" + standingPlaces +
                ", lenght=" + lenght +
                ", height=" + height +
                '}';
    }
}
