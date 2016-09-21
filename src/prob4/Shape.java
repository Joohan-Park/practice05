package prob4;

public abstract class Shape {
	private double height;
	private double width;
	
	public Shape(){
		
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return width;
	}
	public void setWeight(int weight) {
		this.width = weight;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
}
