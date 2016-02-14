package com.natalia;

import org.springframework.stereotype.Component;

@Component
public class Alderman implements ISort {

	@Override
	public void greenSorts() {
		System.out.println(" - Apple Alderman");
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
