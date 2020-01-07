package fr.mds.model;

public abstract class CoolDrink implements Item{
	protected String name;
	protected Packing packing;
	protected float price;

	abstract public String name();

	abstract public Packing packing();

	abstract public float price();
}
