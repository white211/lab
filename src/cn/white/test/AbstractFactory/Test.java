package cn.white.test.AbstractFactory;

public class Test {
    public static void main(String[] args) {
//        Car luxuryCar = new LuxuryCar("Audi");
//        SUV NoluxurySUV = new NoLuxurySUV("BYD");

        LuxuryVehicleFactory luxuryVehicleFactory = new LuxuryVehicleFactory();
        NonLuxuryVehicleFactory nonLuxuryVehicleFactory = new NonLuxuryVehicleFactory();

        System.out.println(luxuryVehicleFactory.getCar().getCarName()+" "+luxuryVehicleFactory.getCar().getCarFeatures());
        System.out.println(nonLuxuryVehicleFactory.getSUV().getSUVName()+" "+nonLuxuryVehicleFactory.getSUV().getSUVFeatures());
    }
}
