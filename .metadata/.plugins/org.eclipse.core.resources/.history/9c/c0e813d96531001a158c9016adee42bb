package fr.mds.model;

import java.util.ArrayList;
import java.util.List;

public class MealBuilder {
	private List<Item> items = new ArrayList<Item>();
	
	public MealBuilder addItem(Item item) {
		items.add(item);
		return this;
	}
	
	public MealBuilder prepareVegMeal(){
		items.add(new VegBurger("Vegi", null, 100));
		items.add(new Pepsi("Pepsi sans sucres", null, 25));
		return this;
    }
	
	public MealBuilder prepareNonVegMeal(){
		items.add(new VegBurger("MassBeef", null, 80));
		items.add(new Coke("Coke classic", null, 30));
		return this;
    }
	
	public Meal build() {
		final Meal result = new Meal();
		result.setItems(this.items);
		items = new ArrayList<Item>();
		return result;
	}
}
