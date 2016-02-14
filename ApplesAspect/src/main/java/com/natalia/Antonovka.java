package com.natalia;

import org.springframework.stereotype.Component;

@Component
public class Antonovka implements ISort {

	private String appleName;
	
	Antonovka() {
		this.appleName = "antonovka";
	}
	
	@Override
	public void greenSorts() {
		System.out.println(" - Apple Antonovka");
	}

	@Override
	public void redSorts() {
		// TODO Auto-generated method stub
	}

	@Override
	public void yellowSorts() {
		// TODO Auto-generated method stub
	}

	




}
