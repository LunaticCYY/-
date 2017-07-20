package Abstract_Factory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory shapeFactory =  FactoryProducer.getFactory("shape");
		
		Shape shape1 = shapeFactory.getShape("circle");
		
		shape1.Draw();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		
		shape2.Draw();
		
		Shape shape3 = shapeFactory.getShape("square");
		
		shape3.Draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		Color color1 = colorFactory.getColor("blue");
		
		color1.Fill();
		
		Color color2 = colorFactory.getColor("green");
		
		color2.Fill();
		
		Color color3 = colorFactory.getColor("red");
		
		color3.Fill();
		
	}

}
