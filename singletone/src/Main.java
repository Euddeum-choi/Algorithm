public class Main {
    public static void main(String[] args){

        Factory factory = Factory.getInstance();
        Car myCar1 = factory.createCar();
        Car myCar2 = factory.createCar();

        System.out.println(myCar1.getCarNumber());
        System.out.println(myCar2.getCarNumber());



    }
}
