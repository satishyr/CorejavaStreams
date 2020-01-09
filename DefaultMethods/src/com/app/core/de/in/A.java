package com.app.core.de.in;

 class A implements Square,Cube {

	@Override
	public void cal(int x) {
		Square.super.cal(10);
		Cube.super.cal(20);
	}

	
	
}
