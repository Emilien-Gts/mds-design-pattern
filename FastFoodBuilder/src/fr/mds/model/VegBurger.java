package fr.mds.model;

public class VegBurger extends Burger{
	public VegBurger() {
		// TODO Auto-generated constructor stub
	}
	
	public VegBurger(String name, Packing packing, float price) {
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
		return true;
	}
}
