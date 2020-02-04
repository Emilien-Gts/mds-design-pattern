package fr.mds.dp.factory;

import fr.mds.dp.model.Blue;
import fr.mds.dp.model.Color;
import fr.mds.dp.model.Green;
import fr.mds.dp.model.Red;
import fr.mds.dp.model.Shape;

public class ColorFactory extends AbstractFactory{
	
	public static final String COLOR = "COLOR";

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
}
