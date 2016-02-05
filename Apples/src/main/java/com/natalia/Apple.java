package com.natalia;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Apple implements IApple {
	
	private String name;
	private String color;
	private String red;
	@Autowired
	private List <ISort> appleSorts;
	

	Apple(String aName) {
		this.name = aName;
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

	public String getRed() {
		return red;
	}

	public void setRed(String red) {
		this.red = red;
	}

	public List<ISort> getAppleSorts() {
		return appleSorts;
	}

	public void setAppleSorts(List<ISort> appleSorts) {
		this.appleSorts = appleSorts;
	}

	@Override
	public void green() {
		System.out.println("I am an " + name + " " + color + " apple!!!!");
		System.out.println("My sorts are: ");
			for (int i = 0; i < appleSorts.size(); i++) {
				appleSorts.get(i).greenSorts();
			}
		
	}

	@Override
	public void red() {
		System.out.println("I am an " + name + " " + red  + " apple!!!!");
		System.out.println("My sorts are: ");
			for (int i = 0; i < appleSorts.size(); i++) {
				appleSorts.get(i).redSorts();
			}
	}

	
}
