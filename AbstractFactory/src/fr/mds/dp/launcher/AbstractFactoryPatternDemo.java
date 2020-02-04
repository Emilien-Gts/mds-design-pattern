package fr.mds.dp.launcher;

import fr.mds.dp.factory.AbstractFactory;
import fr.mds.dp.factory.ColorFactory;
import fr.mds.dp.factory.FactoryProducer;
import fr.mds.dp.factory.ShapeFactory;
import fr.mds.dp.model.AllObjects;
import fr.mds.dp.model.Blue;
import fr.mds.dp.model.Circle;
import fr.mds.dp.model.Color;
import fr.mds.dp.model.CombinedItem;
import fr.mds.dp.model.DrawItem;
import fr.mds.dp.model.Green;
import fr.mds.dp.model.Item;
import fr.mds.dp.model.Rectangle;
import fr.mds.dp.model.Red;
import fr.mds.dp.model.Shape;
import fr.mds.dp.model.Square;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.SHAPE);
		
		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape(Circle.CIRCLE);
		
		// call draw method of Shape Circle
		shape1.draw();
		
		// get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape(Rectangle.RECTANGLE);
		
		// call draw method of Shape Rectangle
		shape2.draw();
		
		// get an object of Shape Square
		Shape shape3 = shapeFactory.getShape(Square.SQUARE);
		
		// call draw method of Shape Square
		shape3.draw();
		
		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.COLOR);
		
		// get an object of Color Red
		Color color1 = colorFactory.getColor(Red.RED);
		
		// call fill method of Red
		color1.fill();
		
		// get an object of Color Green
		Color color2 = colorFactory.getColor(Green.GREEN);
		
		// call fill method of Green
		color2.fill();
		
		// get an object of Color Blue
		Color color3 = colorFactory.getColor(Blue.BLUE);
		
		// call fill method of Color Blue
		color3.fill();
		
		// get an object of Shape Circle
		Shape myShape = FactoryProducer.getFactory(ShapeFactory.SHAPE).getShape(Circle.CIRCLE);
		
		// call draw method of Shape Circle
		myShape.draw();
		
		/************************************/
		
		Item item = FactoryProducer.getItem(AllObjects.BLUE);
		System.out.println("this is a " + item.getName());
		
		item = FactoryProducer.getItem(AllObjects.GREEN);
		System.out.println("this is a " + item.getName());
		
		item = FactoryProducer.getItem(AllObjects.RED);
		System.out.println("this is a " + item.getName());
		
		item = FactoryProducer.getItem(AllObjects.SQUARE);
		System.out.println("this is a " + item.getName());
		
		item = FactoryProducer.getItem(AllObjects.RECTANGLE);
		System.out.println("this is a " + item.getName());
		
		item = FactoryProducer.getItem(AllObjects.CIRCLE);
		System.out.println("this is a " + item.getName());
		
		/************************************/
		
		CombinedItem cItem1 = new CombinedItem();
		cItem1.setColor(colorFactory.getColor(Blue.BLUE));
		cItem1.setShape(shapeFactory.getShape(Square.SQUARE));
		
		CombinedItem cItem2 = new CombinedItem();
		cItem2.setColor(colorFactory.getColor(Red.RED));
		cItem2.setShape(shapeFactory.getShape(Square.SQUARE));
		
		CombinedItem cItem3 = new CombinedItem();
		cItem3.setColor(colorFactory.getColor(Blue.BLUE));
		cItem3.setShape(shapeFactory.getShape(Circle.CIRCLE));
		
		CombinedItem cItem4 = new CombinedItem();
		cItem4.setColor(colorFactory.getColor(Green.GREEN));
		cItem4.setShape(shapeFactory.getShape(Rectangle.RECTANGLE));
		
		DrawItem dItem = new DrawItem();
		
		dItem.setName("mon dessin");
		
		dItem.getItems().add(cItem1);
		dItem.getItems().add(cItem2);
		dItem.getItems().add(cItem3);
		dItem.getItems().add(cItem4);
		
		dItem.print();
	}
}
