package Abstract_Factory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType != null) {
			if(shapeType.equalsIgnoreCase("circle")) {
				return new Circle();
			}else if(shapeType.equalsIgnoreCase("rectangle")) {
				return new Rectangle();
			}else if(shapeType.equalsIgnoreCase("square")) {
				return new Square();
			}
		}
		return null;
	}

}
