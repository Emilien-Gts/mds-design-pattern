package fr.mds.dp.model;

public class Red implements Color, Item {

	public static final String RED = "RED";

	@Override
	public void fill() {
		System.out.println("Red - fill()");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return RED;
	}

}
