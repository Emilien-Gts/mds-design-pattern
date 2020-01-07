package fr.mds.model;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public float getCoast() {
		int finalPrice = 0;
		for (Item item : this.items) {
			finalPrice += item.price();
		}
		
		return finalPrice;
	}
	
	public void showItems() {
		int index = 0;
		for (Item item : this.items) {
			System.out.println(">Item n°"+ index++ + ": "+ item.name());
		}
	}
	
	public Meal() {
		// TODO Auto-generated constructor stub
	}
	
	public Meal(List<Item> mealItems) {
		this.items = mealItems;
	}
	
	@Override
	public String toString() {
		String results = "+";
		
	    for(Item m : items) {
	        results += m.toString(); //if you implement toString() for Dog then it will be added here
	    }
	    
	    return results;
	}
}
