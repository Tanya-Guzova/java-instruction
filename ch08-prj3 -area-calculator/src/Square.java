
public class Square extends Shape {
	private double width;
	
	

	public Square() {
		super();
	}

	public Square(double width) {
		super();
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		double area = Math.pow(width, 2);//same as are = width*width
		return area;
	}

}
