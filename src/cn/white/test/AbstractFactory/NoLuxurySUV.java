package cn.white.test.AbstractFactory;

public class NoLuxurySUV implements SUV {

    private String name;

    public NoLuxurySUV(String name) {
        this.name = name;
    }

    public String getSUVName() {
        // TODO Auto-generated method stub
        return name;
    }

    public String getSUVFeatures() {
        // TODO Auto-generated method stub
        return "NOn-Luxury SUV Featrues";
    }

}
