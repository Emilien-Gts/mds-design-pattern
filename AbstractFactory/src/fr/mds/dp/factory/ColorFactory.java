package fr.mds.dp.factory;

import fr.mds.dp.model.Blue;
import fr.mds.dp.model.Color;
import fr.mds.dp.model.Green;
import fr.mds.dp.model.Item;
import fr.mds.dp.model.Red;
import fr.mds.dp.model.Shape;

public class ColorFactory extends AbstractFactory{
	
	public static final String COLOR = "COLOR";

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase(Red.RED)) {
			return new Red();

		} else if (color.equalsIgnoreCase(Green.GREEN)) {
			return new Green();

		} else if (color.equalsIgnoreCase(Blue.BLUE)) {
			return new Blue();
		}

		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItem(String item) {
		if (item == null) {
			return null;
		}

		if (item.equalsIgnoreCase(Red.RED)) {
			return new Red();

		} else if (item.equalsIgnoreCase(Green.GREEN)) {
			return new Green();

		} else if (item.equalsIgnoreCase(Blue.BLUE)) {
			return new Blue();
		}

		return null;
	}
}
