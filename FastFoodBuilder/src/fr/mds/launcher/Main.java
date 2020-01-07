package fr.mds.launcher;

import fr.mds.model.Meal;
import fr.mds.model.MealBuilder;

public class Main {
	public static void main(String args[]) {         
        /* Meal vegMeal = new Meal();
        System.out.println("vegMeal");
        vegMeal.addItem(new VegBurger("Vegi", null, 100));
        vegMeal.addItem(new Pepsi("Pepsi Sans sucre", null, 150));
        vegMeal.showItems();
        System.out.println(">"+vegMeal.getCoast()); */
		
		MealBuilder mb = new MealBuilder();
		Meal vegMeal = mb.prepareNonVegMeal().build();
		vegMeal.showItems();
    } 
}
