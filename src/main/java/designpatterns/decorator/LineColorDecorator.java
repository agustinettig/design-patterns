package designpatterns.decorator;

public class LineColorDecorator extends ShapeDecorator {

	protected String color;
	
	public LineColorDecorator(Shape decoratedShape, String color) {
		super(decoratedShape);
		this.color = color;
	}

	@Override
	public void draw() {
		this.decoratedShape.draw();	
		System.out.println("Line Color: " + color);
	}

	@Override
	public String description() {
		return this.decoratedShape.description() + " + " + this.color + " line";
	}

}
