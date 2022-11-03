package studio7;

public class Rectangle {
	private double width;
	private double length;
	private double area;
	
	public Rectangle (double initwidth, double initlength) {
		width = initwidth;
		length = initlength;
		area = length * width;
	}
	public double getWidth () {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double calculatePerimeter() {
		return 2*length + 2*width;
	}
	/*we call another object in the class (of the type Rectangle, which contains the descriptors of the instance variables)
	other is the name of the rectangle 
	an object is something that contains multiple values in the form of variables (in this case length, width, area)
	this is used to refer to the object that we're currently talking about. we're calling 
	*/
	public boolean isSmaller(Rectangle other) {
		if (other.getLength()*other.getWidth() >= this.area) {
			return false;
		}
		return true;
	}
	public boolean isSquare(){
		if (this.length == this.width) {
			return true;
		}
		return false;
	}
	
	

}

