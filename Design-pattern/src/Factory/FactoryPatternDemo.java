package Factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("circle");
		
		shape1.Draw();
		
		Shape shape2 = shapeFactory.getShape("square");
		
		shape2.Draw();
		
		Shape shape3 = shapeFactory.getShape("rectangle");
		
		shape3.Draw();
	}

}
