package cn.white.lab3;

public abstract class AppHandler {
	AppHandler nextHandler;

	protected abstract String getSkill();

	public AppHandler getNextHandler() {
		return nextHandler;
	}

	public AppHandler setNextHandler(AppHandler nextHandler) {
		this.nextHandler = nextHandler;
		return this.nextHandler;
	}

	public boolean select(Application app) {

		String[] abilities = app.getAbilities().split(",");
		for (int i = 0; i < abilities.length; i++) {
			if (abilities[i].equals(getSkill())) {
				System.out.println("select by  "
						+ this.getClass().getSimpleName());
				return true;
			}
		}
		System.out.println("CANNOT select by "
				+ this.getClass().getSimpleName());
		return nextHandler.select(app);
	}
}
