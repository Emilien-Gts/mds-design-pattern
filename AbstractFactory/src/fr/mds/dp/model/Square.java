package fr.mds.dp.model;

public class Square implements Shape, Item {

	public static final String SQUARE = "SQUARE";

	@Override
	public void draw() {
		System.out.println("Square - draw()");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return SQUARE;
	}

}
