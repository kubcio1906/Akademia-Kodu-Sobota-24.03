public class Offroad extends Car{
    private boolean reductor, x4Drive, spareWheel;

    public Offroad(String brand, String model, String color,
                   int power, int engineCapasity, double fuelConsumtion,
                   String registrationNumber, boolean reductor, boolean x4Drive, boolean spareWheel) {
        super(brand, model, color, power, engineCapasity, fuelConsumtion, registrationNumber);
        this.reductor = reductor;
        this.x4Drive = x4Drive;
        this.spareWheel = spareWheel;
    }

    public boolean isReductor() {
        return reductor;
    }

    public boolean isX4Drive() {
        return x4Drive;
    }

    public boolean isSpareWheel() {
        return spareWheel;
    }

    @Override
    public String toString() {
        return "Offroad{" +super.toString()+
                " ,reductor=" + reductor +
                ", x4Drive=" + x4Drive +
                ", spareWheel=" + spareWheel +
                '}';
    }
}
