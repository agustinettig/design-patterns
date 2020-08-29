package designpatterns.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		
		System.out.println("Drawing Simple Shape Objects:");
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		circle.draw();
		System.out.println(circle.description());
		rectangle.draw();
		System.out.println(rectangle.description());

		System.out.println("Creating Decorated Circle:");
		Shape lineDecoratedCircle = new LineColorDecorator(new Circle(), "Blue");
		Shape fullyDecoratedCircle = new FillColorDecorator(lineDecoratedCircle, "Red");
		fullyDecoratedCircle.draw();
		System.out.println(fullyDecoratedCircle.description());
		
		System.out.println("Creating Decorated Rectangle:");
		Shape decoratedRectangle = new FillColorDecorator(new LineColorDecorator(new Rectangle(), "Orange"), "Green");
		decoratedRectangle.draw();
		System.out.println(decoratedRectangle.description());
	}
}
