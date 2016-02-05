package com.natalia;

import java.util.Collection;

public class Apple implements IApple {
	
	private String name;
	private String color;
	private String red;
	private ISort iSort;
	private Collection <ISort> appleSorts;
	

	Apple(String aName) {
		this.name = aName;
	}
	
	Apple(String aName, ISort aSort) {
		this.name = aName;
		this.iSort = aSort;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Collection <ISort> getAppleSorts() {
		return appleSorts;
	}

	public void setAppleSorts(Collection <ISort>  appleSorts) {
		this.appleSorts = appleSorts;
	}
	
	public String getRed() {
		return red;
	}

	public void setRed(String red) {
		this.red = red;
	}
	
	public ISort getiSort() {
		return iSort;
	}

	public void setiSort(ISort iSort) {
		this.iSort = iSort;
	}

	@Override
	public void green() {
		System.out.println("I am an " + name + " " + color + " apple!!!!");
		System.out.println("My sorts are: ");
		for (ISort sort : appleSorts) {
			sort.greenSorts();
		}
	}

	@Override
	public void red() {
		System.out.println("I am an " + name + " " + red + " apple!!!!!");
		System.out.println("My sorts are: ");
		for (ISort sort : appleSorts) {
			sort.redSorts();
		}
	}
}
