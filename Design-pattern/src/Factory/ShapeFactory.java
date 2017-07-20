package Factory;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if(shapeType != null) {
			if(shapeType.equalsIgnoreCase("circle")) {	
				return new Circle();	
			}else if(shapeType.equalsIgnoreCase("square")) {
				return new Square();	
			}else if(shapeType.equalsIgnoreCase("rectangle")) {	
				return new Rectangle();	
				
			}
		}
		return null;
	}
}
