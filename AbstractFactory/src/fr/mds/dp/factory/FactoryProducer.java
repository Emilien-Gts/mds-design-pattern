package fr.mds.dp.factory;

import fr.mds.dp.model.Color;
import fr.mds.dp.model.Item;
import fr.mds.dp.model.Shape;

public class FactoryProducer {	
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase(Shape.SHAPE)) {
			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase(Color.COLOR)) {
			return new ColorFactory();
		} else {
			return null;
		}
	}
	
	public static Item getItem(String choice) {

		Item item = new ShapeFactory().getItem(choice);
		if (item == null) {
			item = new ColorFactory().getItem(choice);
		}

		if (item != null) {
			return item;
		}

		return null;
	}
}