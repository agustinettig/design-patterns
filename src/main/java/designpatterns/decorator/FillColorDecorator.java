package designpatterns.decorator;

public class FillColorDecorator extends ShapeDecorator {
	
	protected String color;

	public FillColorDecorator(Shape decoratedShape, String color) {
		super(decoratedShape);
		this.color = color;
	}

	@Override
	public void draw() {
		this.decoratedShape.draw();
		System.out.println("Fill Color: " + color);		
	}

	@Override
	public String description() {
		return this.decoratedShape.description() + " + " + this.color + " fill";
	}

}
