package fr.mds.dp.model;

public class Circle implements Shape, Item {
	
	public static final String CIRCLE = "CIRCLE";

	@Override
	public void draw() {
		System.out.println("Circle - draw()");
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return CIRCLE;
	}

}
