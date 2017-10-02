package cn.white.test.AbstractFactory;

public class LuxurySUV implements SUV{

	private  String name;

    public LuxurySUV(String name) {
        this.name = name;
    }

    public String getSUVName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getSUVFeatures() {
		// TODO Auto-generated method stub
		return "Luxury SUV Features";
	}

}
