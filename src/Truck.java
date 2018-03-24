public class Truck extends Car {
    private int maxCarWegiht, axleNumber;
    private double height;
    private boolean trackTrailer;

    public Truck(String brand, String model, String color, int power,
                 int engineCapasity, double fuelConsumtion, String registrationNumber, int maxCarWegiht, int axleNumber,
                 double height, boolean trackTrailer) {
        super(brand, model, color, power, engineCapasity, fuelConsumtion, registrationNumber);
        this.maxCarWegiht = maxCarWegiht;
        this.axleNumber = axleNumber;
        this.height = height;
        this.trackTrailer = trackTrailer;
    }

    public void setAxleNumber(int axleNumber) {
        this.axleNumber = axleNumber;
    }

    public int getMaxCarWegiht() {
        return maxCarWegiht;
    }

    public int getAxleNumber() {
        return axleNumber;
    }

    public double getHeight() {
        return height;
    }

    public boolean isTrackTrailer() {
        return trackTrailer;
    }

    @Override
    public String toString() {
        return "Truck{" +super.toString()+
                " ,maxCarWegiht=" + maxCarWegiht +
                ", axleNumber=" + axleNumber +
                ", height=" + height +
                ", trackTrailer=" + trackTrailer +
                '}';
    }
}
