package fileDemo;

import java.util.*;

public class Menu {

	private ArrayList<String> menu;
	
	
	
	public Menu() {
		this.menu = new ArrayList<>();
		this.menu.add("0) Exit");
		this.menu.add("1) Create File");
		this.menu.add("2) Open File");
		this.menu.add("3) List dir");
	}



	public ArrayList<String> getMenu() {
		return this.menu;
	}
	
}
