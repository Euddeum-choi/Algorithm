public class Factory {

    private Factory(){}
    private static Factory instance = new Factory();

    public static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }
    public static Car createCar(){
        Car car = new Car();
        return car;
    }

}
