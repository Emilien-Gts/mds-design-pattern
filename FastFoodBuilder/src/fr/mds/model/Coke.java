package fr.mds.model;

public class Coke extends CoolDrink{
	public Coke() {
		// TODO Auto-generated constructor stub
	}
	
	public Coke(String name, Packing packing, float price) {
		super();
		this.name = name;
		this.packing = packing;
		this.price = price;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return this.packing;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public boolean isVeg() {
		// TODO Auto-generated method stub
		return false;
	}
}
