package com.ict.edu10;

public class Clac2 implements Add, Sub, Mul, Div{

	@Override
	public double minus(double s1, double s2) {
		// TODO Auto-generated method stub
		return s1 + s2;
	}

	@Override
	public double plus(double s1, double s2) {
		// TODO Auto-generated method stub
		return s1 - s2;
	}

	@Override
	public double mul(double s1, double s2) {
		// TODO Auto-generated method stub
		return s1 * s2;
	}

	@Override
	public double div(double s1, double s2) {
		// TODO Auto-generated method stub
		return s1 / s2;
	}

}
