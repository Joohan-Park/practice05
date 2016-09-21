package prob2;

public abstract class Bird {
	//fly sing 추상클래스
	private String name;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void fly();
	public abstract void sing();
}
