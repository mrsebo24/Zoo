package zoo.modelcar;

public class Car {
    private String carMake;
    private String capacityInCm3;

    public Car(String carMake, String capacityInCm3) {
        this.carMake = carMake;
        this.capacityInCm3 = capacityInCm3;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCapacityInCm3() {
        return capacityInCm3;
    }

    public void setCapacityInCm3(String capacityInCm3) {
        this.capacityInCm3 = capacityInCm3;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carMake='" + carMake + '\'' +
                ", capacityInCm3='" + capacityInCm3 + '\'' +
                '}';
    }
}
