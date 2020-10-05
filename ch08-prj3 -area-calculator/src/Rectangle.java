
public class Rectangle extends Square {
	private double height;
	

	public Rectangle() {
		super();
		
	}
	
	public Rectangle(double width, double height) {
		super(width);
		this.height = height;
		// TODO Auto-generated constructor stub
	}


	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		double area = getWidth() *height;
		return area;
	}

}
