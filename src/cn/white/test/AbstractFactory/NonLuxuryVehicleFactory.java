package cn.white.test.AbstractFactory;

public class NonLuxuryVehicleFactory extends VehicleFactory {

    @Override
    public Car getCar() {
        return new NoLuxuryCar("非豪华汽车-丰田");
    }

    @Override
    public SUV getSUV() {
        return new NoLuxurySUV("非豪华SUV-传祺");
    }

}
