package fr.mds.dp.model;

public class Rectangle implements Shape, Item {
	
	public static final String RECTANGLE = "RECTANGLE";

	@Override
	public void draw() {
		System.out.println("Rectangle - draw()");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return RECTANGLE;
	}

}
