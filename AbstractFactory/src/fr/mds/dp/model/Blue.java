package fr.mds.dp.model;

public class Blue implements Color, Item {
	
	public static final String BLUE = "BLUE";

	@Override
	public void fill() {
		System.out.println("Blue - fill()");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return BLUE;
	}

}
