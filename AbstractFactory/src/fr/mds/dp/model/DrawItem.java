package fr.mds.dp.model;

import java.util.ArrayList;
import java.util.List;

public class DrawItem {
	private List<CombinedItem> items = new ArrayList<CombinedItem>();
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CombinedItem> getItems() {
		return items;
	}

	public void setItems(List<CombinedItem> items) {
		this.items = items;
	}

	public void print() {
		for (CombinedItem item : items) {
			Item shape = (Item) item.getShape();
			Item color = (Item) item.getColor();
			System.out.println(shape.getName() + " " + color.getName());
		}
	}
}
