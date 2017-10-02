package cn.white.test.AbstractFactory;

public class NoLuxuryCar  implements Car{
	private String name;
	
	public NoLuxuryCar(String name) {
		this.name = name;
	}

	public String getCarName() {
		return name;
	}

	public String getCarFeatures() {
		return "NoLuxury Car Features ";
	}

}
