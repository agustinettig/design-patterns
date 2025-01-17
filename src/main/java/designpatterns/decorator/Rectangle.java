package designpatterns.decorator;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");		
	}

	@Override
	public String description() {		
		return "Rectangle shape";
	}

}
