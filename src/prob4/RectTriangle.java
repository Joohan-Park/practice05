package prob4;

public class RectTriangle extends Shape {

	private double width;
	private double height;
	
	public RectTriangle(double width, double height){
		this.height=height;
		this.width=width;
}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
	
		return (height*width)/2;
	}

	@Override
	public double getPerimeter() {
		
		return (Math.sqrt((height*height)+(width*width)))+width+height;
	}

}
