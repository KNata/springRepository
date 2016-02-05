package com.natalia;

public class Champion implements ISort{
	
	private String appleName;
	
	Champion() {
		this.appleName = "Champion";
	}

	public void mySort() {
		
	}

	@Override
	public void redSorts() {
		System.out.println(" - Apple " + appleName);
		
	}

	
	@Override
	public void greenSorts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yellowSorts() {
		// TODO Auto-generated method stub
		
	}
}
