package cn.white.test.AbstractFactory;

public abstract class VehicleFactory {
    public static final String LUXURY_VEHICLE = "Luxury";
    public static final String NON_LUXURY_VEHICLE = "Non_Luxury";

    public abstract Car getCar();
    public abstract SUV getSUV();
}
