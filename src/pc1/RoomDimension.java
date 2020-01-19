package pc1;

public class RoomDimension {
	private double length;
	private double width;
	
	public RoomDimension(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public String toString(){
	      String output = ("Length: " + length + " feet" + "\n" + "Width: " + width + " feet" + "\n" + "Area: " + getArea() + " square feet");
	      return output;
	    }
}
