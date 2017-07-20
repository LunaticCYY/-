package Abstract_Factory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		if(color != null){
			if(color.equalsIgnoreCase("blue")) {
				return new Blue();
			}else if(color.equalsIgnoreCase("green")) {
				return new Green();
			}else if(color.equalsIgnoreCase("red")) {
				return new Red();
			}
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
