package cn.white.test.AbstractFactory;

public class LuxuryVehicleFactory extends VehicleFactory {

    @Override
    public Car getCar() {
        return new LuxuryCar("豪华汽车-奔驰");
    }

    @Override
    public SUV getSUV() {
        return new LuxurySUV("豪华SUV-宝马");
    }


}
