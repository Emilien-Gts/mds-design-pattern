package fr.mds.dp.factory;

import fr.mds.dp.model.Circle;
import fr.mds.dp.model.Color;
import fr.mds.dp.model.Rectangle;
import fr.mds.dp.model.Shape;
import fr.mds.dp.model.Square;

public class ShapeFactory extends AbstractFactory {

	public static final String SHAPE = "SHAPE";

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}

		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();

		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}

		return null;
	}

}
