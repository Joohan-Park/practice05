package prob4;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	
	public Rectangle(double width, double height){
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
		
		return width*height;
	}

	@Override
	public double getPerimeter() {
		
		return (width*2) + (height*2);
	}

	@Override
	public void resize(double s) {
		width*=s;
		height*=s;
		
	}

}
