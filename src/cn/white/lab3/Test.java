package cn.white.lab3;

public class Test {
  public static void main(String[] args) {
	 LocalDirector director = new LocalDirector();
	 director.setNextHandler(new DistrictManager())
	 .setNextHandler(new CompanyChief());
	  
	Application application = new Application();
	application.setAbilities("spring,mybatis,vue.js");

	director.select(application);
}
} 
