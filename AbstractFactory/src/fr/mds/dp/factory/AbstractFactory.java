package fr.mds.dp.factory;

import fr.mds.dp.model.Color;
import fr.mds.dp.model.Item;
import fr.mds.dp.model.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
	public abstract Item getItem(String item);
}
