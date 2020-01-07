package fr.mds.model;

public interface Item {
	public String name();
	public Packing packing();
	public float price();
	public boolean isVeg();
}
