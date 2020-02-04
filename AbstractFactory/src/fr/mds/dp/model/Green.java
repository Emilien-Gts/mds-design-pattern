package fr.mds.dp.model;

public class Green implements Color, Item {
	
	public static final String GREEN = "GREEN";

	@Override
	public void fill() {
		System.out.println("Green - fill()");
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return GREEN;
	}

}
