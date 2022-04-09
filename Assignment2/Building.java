/**
 * Building class describes the properties of building likely height,width,color 
 * and shape of the building like rectangle.
 */

public class Building {
	
	private String shape;
	private double height;
	private double width;
	private String color;

	public Building(String shape,double height, double width, String color) { 
		
		this.shape = shape;
		this.height = height;
		this.width = width;
		this.color = color;		
	}

// getterand setter methods are used to describe the properties of the building class.
	
	public String getShape() {
		return shape;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String getColor() {
		return color;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}
