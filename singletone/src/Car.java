public class Car {
    static int serialNumber = 10000;
    public int carNumber;

    Car(){
        serialNumber++;
        carNumber = serialNumber;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
}
